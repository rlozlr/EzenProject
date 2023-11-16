    // quidditch 이미지 자동 슬라이드
    let slideIndex = 0;
    showSlides();
    function showSlides() {
        let i;
        let slides = document.getElementsByClassName("quidditch");

        for (i = 0; i < slides.length; i++) {
            slides[i].style.display = "none";
        }
        slideIndex++;
        if (slideIndex > slides.length) {
            slideIndex = 1;
        }
        slides[slideIndex - 1].style.display = "block";
    
        setTimeout(showSlides, 1500); // 1.5초마다 이미지가 체인지됩니다
    }

    // 'Hogwarts' 로고 클릭 시 home.html로 이동
    document.getElementById("logo").addEventListener('click', function() {
        console.log("Logo Clicked!"); // 디버깅을 위한 로그
        window.location.href = "/home.html";
    });

    // 'homeLogo' 이미지 클릭 시 home.html로 이동
    document.getElementById("homeLogo").addEventListener('click', function() {
        console.log("Home Logo Clicked!"); // 디버깅을 위한 로그
        window.location.href = "/home.html";
    });
