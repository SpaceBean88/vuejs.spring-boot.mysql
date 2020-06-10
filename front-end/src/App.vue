<template>
  <div id="app">
    <main-header></main-header>
    <router-view/>
    <join-page></join-page>
    <main-footer></main-footer>
  </div>
</template>

<script>
import MainHeader from './components/include/MainHeader.vue'
import JoinPageVue from './views/JoinPage.vue'
import MainFooterVue from './components/include/MainFooter.vue'
export default {
  name: 'app',
  components: {
    'main-header': MainHeader,
    'main-footer': MainFooterVue,
    'join-page': JoinPageVue
  }
}
</script>

<style lang="scss">
</style>
