<template>
  <div class="container">
    <div class="row">
      <div class="title-wrap">
        <p id="title">Login</p>
      </div>
      <div class="login-wrap">
        <form class="submitForm" id="submitForm">
          <div class="form-group loginForm">
            <label for="userId">ID:</label>
            <input type="text" class="form-control" id="userId" name="userId">
          </div>
          <div class="form-group loginForm">
            <label for="userPw">Password:</label>
            <input type="password" class="form-control" id="userPw" name="userPw">
          </div>
        </form>
      </div>
      <div class="button-wrap">
          <button class="btn btn-outline-success" @click="submitForm">Login</button>
          <button class="btn btn-outline-warning" @click="$router.push({ path: '/join' })">Sign Up</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  methods: {
    submitForm () {
      alert('성공!')
    }
  }
}
</script>

<style scoped>
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

.login-wrap {
  margin-top: 20px;
  margin-bottom: 20px;
  width: 100%;
}

.loginForm {
  width: 350px;
  margin: 0 auto;
  margin-bottom: 30px;
}

.loginForm > label {
  margin: 2px;
  font-family: 'Noto Sans KR', sans-serif;
  font-weight: bold;
}

.loginForm > input {
  padding: 0px 5px;
  border-style: none;
  border-radius: 0;
  border-bottom: 2px solid #000000;
  font-family: 'Noto Sans KR', sans-serif;
  height: 30px;
}

.button-wrap {
  margin: 0 auto;
}

.button-wrap > button {
  margin: 0px 10px;
  font-family: 'Noto Sans KR', sans-serif;
}
</style>
