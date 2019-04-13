$(document).ready(() => {

    // Clear any input values
    $("#new-width").val("");
    $("#new-height").val("");
    
    // Circle start values
    const width = $("#circle").css("width");
    const height = $("#circle").css("height");
    
    let expanded = false;

    // If circle not yet expanded, expandCircle, else contractCircle
    $("#btn").on("click", () => {

        if (!expanded) {
            let vals = readVals();
            if (vals) {
                expandCircle(vals.width, vals.height);
                expanded = true;
                $("#btn").html("Reset Animation");
            }
            else {
                alert("Input values");
            }
        }
        
        else {
            contractCircle();
            expanded = false;
            $("#btn").html("Start Animation");
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
    
    const expandCircle = (newWidth, newHeight) => {
        $("#circle").animate({"width": newWidth, "height": newHeight})
    };
    const contractCircle = () => {
        $("#circle").animate({"width": width, "height": height})
    };

});
