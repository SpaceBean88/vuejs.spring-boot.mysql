<template>
  <div id="header-wrap">
    <p id="h-title">SpaceBean Project</p>
    <ul id="nav-menu">
      <router-link
      v-for="list in lists"
      :key="list.key"
      :to="list.link"
      tag="li"
      class="header-menu-list"
      class-active="active"
      exact>{{ list.title }}
      </router-link>
    </ul>
  </div>
</template>

<script>
export default {
  data () {
    return {
      lists: [
        { link: '/', title: 'Main' },
        { link: '/login', title: 'Login' },
        { link: '/join', title: 'Sign Up' }
      ]
    }
  }
}
</script>

<style scoped>
  #header-wrap {
    padding: 10px;
    height: 150px;
    background-color: #69ccda;
  }
  @import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap');
  #h-title {
    height:75px;
    text-align: center;
    font-family: 'Noto Sans KR', sans-serif;
    font-size: 35px;
    font-weight: 700;
    color: #ffffff;
  }

  /* nav list */
  #nav-menu {
    list-style: none;
    margin:0px;
    padding: 0px;
    width: 500px;
    margin: 0 auto;
  }

  .header-menu-list,
  .ruter-link-active {
    display: inline-block;
    margin-right:15px;
    font-family: 'Noto Sans KR', sans-serif;
    font-size: 20px;
    font-weight: 700;
    cursor: pointer;
  }
</style>
