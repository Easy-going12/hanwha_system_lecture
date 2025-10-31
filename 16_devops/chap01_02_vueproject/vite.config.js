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

  server: {
    proxy: {
      '/api': {
        target: 'http://localhost:8055', // 백엔드 호스트 포트
        changeOrigin: true,
        rewrite: (path) => path.replace(/^\/api/, ''), // /api 제거 → /plus 로 전달
      }
    }
  }
})
