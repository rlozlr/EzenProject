window.addEventListener("load", function () {
    // 윈도우 로드 시 비디오 플레이
    var video = document.getElementById("video");
    if (video) {
        video.play();
    }
    // 작동하는지 콘솔창에서 확인
    console.log("test");
});

setInterval(function () {
    var video = document.getElementById("video");
    if (video && video.ended) {
        // 영상 종료 후 어떤 작업을 할 건지 작성
        location.href = "login.html";
    }
}, 200);
document.addEventListener('click', ()=>{

})