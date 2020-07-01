module.exports = {
  outputDir: '../src/main/resources/static',
  indexPath: '../static/index.html',
  devServer: {
    port: 3000,
    proxy: {
      '/api/*': {
        target: 'http://localhost:8080'
      }
    }
  }
}
