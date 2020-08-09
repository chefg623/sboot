module.exports = {


    // 配置 webpack-dev-server 行为。
    devServer: {
        open: false,//项目启动时是否自动打开浏览器，我这里设置为false,不打开，true表示打开
        proxy: {
            '/api': {
                target: 'http://localhost:8181',
                ws:true,
                changeOrigin: true,
                pathRewrite: {
                    '^/api': '/'
                }
            }
        }
    }

}