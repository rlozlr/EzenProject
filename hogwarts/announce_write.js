function updateMsg() {
    const userName = document.getElementById('userName').value;
    const userPwd = document.getElementById('userPwd').value;
    const title = document.getElementById('title').value;
    const content = document.getElementById('content').value;

    if (!title || !content || !userName || !userPwd) {
        alert("이름, 비밀번호, 제목, 내용\n모두 작성되어야 합니다.");
        return;
    }
    const post = {
        userName: userName,
        userPwd: userPwd,
        title: title,
        content: content
    };
    // localStorage.getItem('announcements'): 'announcements' 키에 저장된 데이터를 가져옴 (문자열 형태)
    const existingPosts = JSON.parse(localStorage.getItem('announcements')) || [];
    // existingPosts.push(post): 새로운 게시물(post)을 기존 게시물 배열에 추가
    existingPosts.push(post);
    // JSON.parse(...) || []: 가져온 문자열 데이터를 JavaScript 객체로 변환
    // 변환에 실패하면(문자열이 유효한 JSON 형식이 아니면) 빈 배열([])을 기본값으로 설정
    localStorage.setItem('announcements', JSON.stringify(existingPosts));
    alert("업로드 되었습니다.");
}