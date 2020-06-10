<template>
  <div class="container">
    <div class="row">
      <div class="title-wrap">
        <p id="title">Sign-Up</p>
      </div>
      <div class="join-wrap">
        <form class="submitForm" id="submitForm">
          <div class="form-group joinForm">
            <label for="userId">ID:</label>
            <input type="text" class="form-control" id="userId" name="userId" v-model="form.id">
          </div>
          <div class="form-group joinForm">
            <label for="userPw">Password:</label>
            <input type="password" class="form-control" id="userPw" name="userPw" v-model="form.pw">
          </div>
          <div class="form-group joinForm">
            <label for="userName">Name:</label>
            <input type="text" class="form-control" id="userName" name="userName" v-model="form.name">
          </div>
          <div class="form-group joinForm">
            <label for="userNick">Nickname:</label>
            <input type="text" class="form-control" id="userNick" name="userNick" v-model="form.nick">
          </div>
          <div class="form-group joinForm">
            <label id="emailLabel" for="userEmail">Email:</label>
            <input type="text" class="form-control" id="userEmail" name="userEmail" v-model="form.email">
            <span>@</span>
            <select id="emailSelc">
              <option>google.com</option>
              <option>naver.com</option>
              <option>yahoo.com</option>
            </select>
          </div>
        </form>
      </div>
      <div class="button-wrap">
        <button class="btn btn-outline-success" v-on:click="submitForm">Confirm</button>
        <button class="btn btn-outline-danger">Cancel</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'JoinPage',
  data () {
    return {
      form: {
        id: '',
        pw: '',
        name: '',
        nick: '',
        email: ''
      }
    }
  },
  methods: {
    submitForm () {
      alert('complete')
    }
  }
}
</script>

<style scoped>
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
  width: 200px;
  height:65px;
  line-height: 80px;
  border-bottom: 3px solid #00b9a1;
  text-align: center;
  font-family: 'Noto Sans KR', sans-serif;
  font-size: 26px;
  font-weight: 900;
}

.join-wrap {
  margin-top: 50px;
  margin-bottom: 20px;
  width: 100%;
}

.joinForm {
  width: 500px;
  margin: 0 auto;
  margin-bottom: 10px;
}

.joinForm > label {
  margin: 2px;
  font-family: 'Noto Sans KR', sans-serif;
  font-weight: bold;
}

.joinForm > input {
  padding: 0px 5px;
}

#emailLabel {
  display: block;
}

#userEmail {
  display: inline-block;
  width: 250px;
}

#emailSelc {
  width: 232px;
  height: 38px;
  border: 1px solid #ddd;
  font-family: 'Noto Sans KR', sans-serif;
}

.button-wrap {
  margin: 0 auto;
}

.button-wrap > button {
  margin: 0px 10px;
  font-family: 'Noto Sans KR', sans-serif;
}
</style>
