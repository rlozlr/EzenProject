document.addEventListener('DOMContentLoaded', function () {
    const announcementList = document.getElementById('announcementList');
    const announcements = JSON.parse(localStorage.getItem('announcements')) || [];

    if (announcements.length > 0) {
        announcements.forEach((announcement, index) => {
            const contentBox = createContentBox(index + 5, announcement.title);
            announcementList.appendChild(contentBox);
        });
    } else {
        announcementList.innerHTML = '게시물이 존재하지 않습니다.';
    }

    // 이벤트 위임을 사용하여 삭제 버튼 이벤트 처리
    announcementList.addEventListener('click', function (event) {
        if (event.target.classList.contains('xBtn')) {
            // 삭제 버튼이 클릭된 경우
            const contentBox = event.target.closest('.content-box');
            const checkNumber = contentBox.querySelector('.check').textContent;
            const index = parseInt(checkNumber) - 5;

            // 삭제할 게시글을 announcements 배열에서 제거
            announcements.splice(index, 1);
            // 삭제된 배열을 다시 로컬 스토리지에 저장
            localStorage.setItem('announcements', JSON.stringify(announcements));

            // 화면에서 삭제
            contentBox.remove();
        }
    });
});

function createContentBox(checkNumber, title) {
    const contentBox = document.createElement('div');
    contentBox.classList.add('content-box');
    contentBox.innerHTML = `
        <div class="check">${checkNumber}.</div>
        <div class="title">${title}</div>
        <div class="delete"><button type="button" class="xBtn">X</button></div>
    `;
    return contentBox;
}

function writeAnnouncement() {
    // 글쓰기 버튼 클릭 시 실행되는 함수
    const announcements = JSON.parse(localStorage.getItem('announcements')) || [];
    const currentCount = announcements.length;

    // 새로운 게시물 추가 (4개 이하인 경우에만 추가)
    if (currentCount < 4) {
        // 사용자가 입력한 제목 가져오기
        const titleInput = document.getElementById('title');
        const newAnnouncement = {
            title: titleInput.value
        };

        announcements.push(newAnnouncement);
        localStorage.setItem('announcements', JSON.stringify(announcements));
        // 새로 추가된 게시물을 화면에 표시
        const contentBox = createContentBox(currentCount + 5, newAnnouncement.title);
        announcementList.appendChild(contentBox);
    } else {
        alert("더 이상 게시물을 추가할 수 없습니다.");
        document.getElementById('writeLink').href = 'announce_2nd.html';
    }
}