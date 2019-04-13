$(document).ready(() => {

    const target = $(".hidden");
    
    $("#btn-boven").on("click", () => {
        target.fadeOut(1000);
    });


    $("#btn-beneden").on("click", () => {
        target.fadeIn(1000);
    });

});
