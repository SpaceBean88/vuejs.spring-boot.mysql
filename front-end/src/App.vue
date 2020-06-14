<template>
  <div id="app">
    <main-header></main-header>
    <router-view/>
    <main-footer></main-footer>
  </div>
</template>

<script>
import MainHeader from './components/include/MainHeader.vue'
import MainFooterVue from './components/include/MainFooter.vue'
export default {
  name: 'app',
  components: {
    'main-header': MainHeader,
    'main-footer': MainFooterVue
  }
}
</script>

<style lang="scss">
</style>
