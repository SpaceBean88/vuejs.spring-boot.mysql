<template>
  <section>
    <div class="container">
      <div class="row">
        <div class="title-wrap">
          <p id="title">Sign-Up</p>
        </div>
        <div class="join-wrap">
          <form class="submitForm" id="submitForm" @submit.prevent="submitForm">
            <div class="form-group joinForm">
              <label for="userId">ID:</label>
              <input type="text" class="form-control" id="userId" ref="userId" placeholder="아이디는 6~8자로 입력해 주세요.">
            </div>
            <div class="form-group joinForm">
              <label for="userPw">Password:</label>
              <input type="password" class="form-control" id="userPw" ref="userPw" placeholder="비밀번호는 4~8자로 입력해 주세요.">
            </div>
            <div class="form-group joinForm">
              <label for="pwCheck">Password Check:</label>
              <input type="password" class="form-control" id="pwCheck" placeholder="비밀번호를 확인해 주세요.">
            </div>
            <div class="form-group joinForm">
              <label for="userName">Name:</label>
              <input type="text" class="form-control" id="userName" ref="userName" placeholder="이름을 입력해 주세요.">
            </div>
            <div class="form-group joinForm">
              <label id="emailLabel" for="userEmail">Email:</label>
              <input type="text" class="form-control" id="userEmail" ref="userEmail" placeholder="abc@ooo.com">
            </div>
          </form>
        </div>
        <div class="button-wrap">
          <button type="submit" class="btn btn-outline-success">Confirm</button>
          <button type="button" class="btn btn-outline-danger" @click="$router.push({ path: '/' })">Cancel</button>
        </div>
      </div>
    </div>
  </section>
</template>

<script>
export default {
  name: 'JoinPage',
  methods: {
    submitForm () {
      alert('success!')
    }
  }
}
</script>

<style scoped>
.container {
  height: 100%;
}

.submitForm {
  margin: 0 auto;
}

.title-wrap {
  width:100%;
  height: 100px;
  line-height: 100px;
  margin: 0 auto;
}

@import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap');
.title-wrap > #title {
  margin: 0 auto;
  width: 150px;
  height:65px;
  line-height: 80px;
  border-bottom: 3px solid #69ccda;
  text-align: center;
  font-family: 'Noto Sans KR', sans-serif;
  font-size: 24px;
  font-weight: 900;
}

.join-wrap {
  margin-top: 20px;
  width: 100%;
}

.joinForm {
  width: 400px;
  margin: 0 auto;
  margin-bottom: 10px;
}

.joinForm > label {
  margin: 2px;
  color: #000000;
  font-family: 'Noto Sans KR', sans-serif;
  font-size: 14px;
  font-weight: bold;
}

.joinForm > input {
  padding: 0px 5px;
  border-style: none;
  border-radius: 2;
  border: 1px solid #dddddd;
  font-family: 'Noto Sans KR', sans-serif;
  font-size: 14px;
  height: 40px;
}

  .form-control:focus {
    box-shadow: none;
    border: 2px solid #69ccda;
  }

#emailLabel {
  display: block;
}

.button-wrap {
  margin: 0 auto;
}

.button-wrap > button {
  margin: 0px 10px;
  font-family: 'Noto Sans KR', sans-serif;
}
</style>
