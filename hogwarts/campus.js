

document.getElementById("iconButton").addEventListener("click", function (event) {
    // 클릭 시 기본 동작 막기
    event.preventDefault();

    // art6 요소 가져오기
    var art6 = document.getElementById("art6");

    // 클릭 시 실행할 동작 추가
    alert("신청이 완료되었습니다. 부가적인 문의사항은 연락바랍니다.");

    // 일정 시간이 지난 후에 배경 이미지 변경
    setTimeout(function () {
        // art6에 있는 모든 텍스트를 숨기거나 제거
        var textElements = art6.querySelectorAll("h2, h3");
        for (var i = 0; i < textElements.length; i++) {
            textElements[i].style.display = "none"; // 또는 textElements[i].remove();
        }
        
        // art6에 투명도 효과 주기 (임시적인 애니메이션을 위해)
        art6.style.transition = "background 0.5s ease-out";
        art6.style.backgroundImage = "url('image/편지.jpg')";
        art6.style.backgroundSize = "500px 400px"; // 또는 "contain"으로 설정
        art6.style.backgroundRepeat = "no-repeat";
        art6.style.borderRadius = "20px";
    }, 500); // 0.5초(500밀리초) 후에 실행
});

