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
          <button class="btn bLogin" @click="submitForm">Login</button>
          <button class="btn bJoin" @click="$router.push({ path: '/join' })">Sign Up</button>
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
  margin-bottom: 10px;
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
  border-radius: 0;
  border: 1px solid #dddddd;
  font-family: 'Noto Sans KR', sans-serif;
  font-size: 13px;
  height: 35px;
}

.form-control:focus {
  box-shadow: none;
  border: 2px solid #69ccda;
}

.button-wrap {
  margin: 0 auto;
  width: 370px;
}

.button-wrap > button {
  display: block;
  margin: 2px 10px;
  font-family: 'Noto Sans KR', sans-serif;
  width: 350px;
  height: 35px;
  padding: 0;
}

.bLogin,
.bLogin:focus {
  border-radius: 0;
  background-color: #69ccda;
  box-shadow: none;
  color: white;
  font-weight: bold;
}

.bJoin,
.bJoin:focus {
  border-radius: 0;
  background-color: #ffa1a1;
  box-shadow: none;
  color: white;
  font-weight: bold;
}

.bLogin:hover,
.bJoin:hover {
  color: #000000
}
</style>
