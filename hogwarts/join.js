
function redirectToLogin() {
    window.open("login.html");
}

// Join 부분 체크
function signUpCheck() {
  let name = document.getElementById("name");
  let password = document.getElementById("password");
  let passwordCheck = document.getElementById("passwordCheck");
  let area = document.getElementById("area").value;
  let student = document.getElementById("student").checked;
  let professor = document.getElementById("professor").checked;
  let check = true;

  // id에 관한 규칙 확인 (8글자 이상)
  if (name.value === "") {
    document.getElementById("nameError").innerHTML = "이름이 올바르지 않습니다.";
    check = false;
  } else if (name.value.length < 8) {
    document.getElementById("nameError").innerHTML = "이름이 올바르지 않습니다. (8자 이상)";
    check = false;
  } else {
    document.getElementById("nameError").innerHTML = "";
  }

  // 비밀번호 일치 확인
  if (password.value !== passwordCheck.value) {
    document.getElementById("passwordError").innerHTML = "";
    document.getElementById("passwordCheckError").innerHTML = "비밀번호가 동일하지 않습니다.";
    check = false;
  } else {
    document.getElementById("passwordError").innerHTML = "";
    document.getElementById("passwordCheckError").innerHTML = "";
  }

  // 비밀번호 재확인 확인
  if (passwordCheck.value === "") {
    document.getElementById("passwordCheckError").innerHTML = "비밀번호를 다시 입력해주세요.";
    check = false;
  } else {
    // document.getElementById("passwordCheckError").innerHTML = "";
  }

  // 비밀번호 규칙 확인 (8글자 이상, 영어, 숫자, 특수문자 포함 (@$!%*#?&))
  let reg = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,}$/.test(password.value);
  if (password.value === "") {
    document.getElementById("passwordError").innerHTML = "비밀번호를 입력해주세요.";
    check = false;
  } else if (!reg) {
    document.getElementById("passwordError").innerHTML = "8자 이상, 영어, 숫자, 특수문자 포함 (@$!%*#?&)";
    check = false;
  } else {
    // document.getElementById("passwordError").innerHTML = "";
  }

  // 기숙사 선택 확인
  if (area === "Choose Dormitory") {
    document.getElementById("areaError").innerHTML = "기숙사를 선택해주세요.";
    check = false;
  } else {
    document.getElementById("areaError").innerHTML = "";
  }

  // child 체크확인
  if (!student && !professor) {
    document.getElementById("chlidError").innerHTML = "직업을 선택해주세요.";
    check = false;
  } else {
    document.getElementById("chlidError").innerHTML = "";
  }

  if (check) {
    document.getElementById("nameError").innerHTML = "";
    document.getElementById("passwordError").innerHTML = "";
    document.getElementById("passwordCheckError").innerHTML = "";
    document.getElementById("areaError").innerHTML = "";
    document.getElementById("chlidError").innerHTML = "";

    window.location.href = "login.html";
  }
}
