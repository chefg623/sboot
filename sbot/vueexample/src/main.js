import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import './plugins/element.js'
import Axios from "axios";


//设置代理，前端请求发送到localhost:8181/api
var axios = require('axios')
axios.defaults.baseURL = 'http://localhost:8181/api'
//全局注册，之后其他的组件通过this.$axios发送数据
Vue.prototype.$axios = Axios
Vue.config.productionTip = false

router.beforeEach((to, from, next) => {
      if (to.meta.requireAuth) {
        if (store.state.user.username) {
          next()
        } else {
          next({
            path: 'login',
            query: {redirect: to.fullPath}
          })
        }
      } else {
        next()
      }
    }
)

new Vue({
  el:'#app',
  router,
  store,
  components: { App },
  render: h => h(App)
}).$mount('#app')
