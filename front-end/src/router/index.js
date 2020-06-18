import Vue from 'vue'
import VueRouter from 'vue-router'
import JoinPage from '@/views/userPage/JoinPage'
import MainPage from '@/views/Main'
import LoginPage from '@/views/userPage/LoginPage'
import AboutPage from '@/views/contentsPages/AboutPage'
import CashBookMain from '@/views/contentsPages/CashBookMain'
import ContactPage from '@/views/contentsPages/ContactPage'
import CalculatorPage from '@/views/contentsPages/CalculatorPage'

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
}, {
  path: '/about',
  name: '/AboutPage',
  component: AboutPage
}, {
  path: '/cashbook',
  name: '/CashBookMain',
  component: CashBookMain
}, {
  path: '/contact',
  name: '/ContactPage',
  component: ContactPage
}, {
  path: '/calculator',
  name: '/CalculatorPage',
  component: CalculatorPage
}
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
