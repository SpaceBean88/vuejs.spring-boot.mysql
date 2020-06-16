<template>
<header>
  <div id="header-wrap">
    <div id="header-top">
      <ul id="nav-top-menu">
        <router-link
        v-for="list1 in lists1"
        :key="list1.key"
        :to="list1.link"
        tag="li"
        class="header-top-menu"
        class-active="active"
        exact> {{ list1.title }}
        </router-link>
      </ul>
    </div>
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
</header>
</template>

<script>
export default {
  data () {
    return {
      lists: [
        { link: '/', title: 'Main' },
        { link: '/about', title: 'About' },
        { link: '/cashbook', title: 'Cashbook' },
        { link: '/contact', title: 'Contact' }
      ],
      lists1: [
        { link: '/join', title: 'Sign Up' },
        { link: '/login', title: 'Login' }
      ]
    }
  }
}
</script>

<style scoped>
  #header-wrap {
    height: 160px;
    box-shadow: 0px 2px 10px 0px #ddd;
  }

  #header-top {
    padding: 5px 0px;
    height: 30px;
  }

  @import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap');
  #h-title {
    height:75px;
    line-height: 75px;
    text-align: center;
    font-family: 'Noto Sans KR', sans-serif;
    font-size: 30px;
    font-weight: 700;
    background-color: #69ccda;
    color: #ffffff;
  }

  /* nav list */
  #nav-menu {
    list-style: none;
    margin:0px;
    padding: 0px;
    width: 100%;
    text-align: center;
  }

  #nav-top-menu {
    margin: 0;
    height: 20px;
    list-style: none;
    margin:0px;
    padding: 0px;
    width: 100%;
    margin: 0 auto;
  }

  .header-menu-list,
  .ruter-link-active {
    display: inline-block;
    margin-right:30px;
    font-family: 'Noto Sans KR', sans-serif;
    font-size: 17px;
    font-weight: 700;
    cursor: pointer;
  }

  .header-menu-list:hover {
    border-bottom: 3px solid #000000;
  }

  .header-top-menu {
    display: block;
    margin-right:15px;
    font-family: 'Noto Sans KR', sans-serif;
    font-size: 12px;
    font-weight: 900;
    cursor: pointer;
    float: right;
  }

</style>
