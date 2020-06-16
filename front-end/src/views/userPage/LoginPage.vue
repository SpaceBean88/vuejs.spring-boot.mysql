<template>
    <section>
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
    </section>
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
section {
  margin-top: 20px;
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

.login-wrap {
  margin-top: 20px;
  margin-bottom: 20px;
  width: 100%;
}

.loginForm {
  width: 350px;
  margin: 0 auto;
  margin-bottom: 20px;
}

.loginForm > label {
  margin-bottom: 10px;
  font-family: 'Noto Sans KR', sans-serif;
  font-size: 14px;
  font-weight: bold;
}

.loginForm > input {
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

.button-wrap {
  text-align: center;
}

.button-wrap > button {
  margin: 0px 10px;
  font-family: 'Noto Sans KR', sans-serif;
}
</style>
