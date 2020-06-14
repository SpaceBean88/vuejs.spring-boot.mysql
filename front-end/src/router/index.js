import Vue from 'vue'
import VueRouter from 'vue-router'
import JoinPage from '@/views/userPage/JoinPage'
import MainPage from '@/views/Main'
import LoginPage from '@/views/userPage/LoginPage'

Vue.use(VueRouter)

const routes = [{
  path: '/',
  name: '/MainPage',
  component: MainPage
}, {
  path: '/join',
  name: '/JoinPage',
  component: JoinPage
}, {
  path: '/login',
  name: '/LoginPage',
  component: LoginPage
}
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
