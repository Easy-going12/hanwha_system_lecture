import { fileURLToPath, URL } from 'node:url'

import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import vueDevTools from 'vite-plugin-vue-devtools'

// https://vite.dev/config/
export default defineConfig({
  plugins: [
    vue(),
    vueDevTools(),
  ],
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src', import.meta.url))
    },
  },

  // server: {
  //   host: true,            // 컨테이너 밖에서 접속하려면 필요
  //   port: 5173,            // compose에서 8011:5173으로 노출
  //   proxy: {
  //     '/api': {

  //       /* 백엔드가 컨테이너화 되기 전 */
  //       // target: 'http://localhost:7777'

  //       /* 백엔드가 컨테이너화 된 후 */
  //       // target: 'http://localhost:8055',

  //       /* docker-compose 이후 도커 네트워크 활용 */
  //       target: 'http://springboot-app:7777', // 백엔드 호스트 포트
  //       changeOrigin: true,
  //       rewrite: (path) => path.replace(/^\/api/, ''), // /api 제거 → /plus 로 전달
  //     }
  //   }
  // }
})
