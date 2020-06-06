import Vue from 'vue'
import VueRouter from 'vue-router'
import JoinPage from '@/views/JoinPage'

Vue.use(VueRouter)

const routes = [{
  path: '/join',
  name: '/JoinPage',
  component: JoinPage
}
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
