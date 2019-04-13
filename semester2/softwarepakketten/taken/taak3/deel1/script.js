$(document).ready(() => {

    // Clear any input values
    $("#new-width").val("");
    $("#new-height").val("");
    
    // Get circle start values
    const width = $("#circle").css("width");
    const height = $("#circle").css("height");
    
    let expanded = false;

    // Expand circle with user input values, otherwise with start values 
    $("#btn").on("click", () => {

        if (!expanded) {
            let vals = readVals();
            if (vals) {
                animateCircle(vals.width, vals.height);
                expanded = true;
                $("#btn").html("Reset Circle");
            }
            else {
                alert("Input values");
            }
        }
        
        else {
            animateCircle(width, height);
            expanded = false;
            $("#btn").html("Apply Changes");
        }
        
    });

    // Get form input values
    const readVals = () => {

        if ($("#new-width").val() === "" || $("#new-height").val() === "") {
            return;
        }
        
        let newWidth = $("#new-width").val() + "px";
        let newHeight = $("#new-height").val() + "px";
        
        return { width : newWidth,
                 height : newHeight
               };
    };
    
    const animateCircle = (width, height) => {
        $("#circle").animate({"width": width, "height": height});
    };

});
