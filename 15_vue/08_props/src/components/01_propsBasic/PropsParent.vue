<template>
    <div>
        <PropsChild :message="message2"/> <!-- message2에 값을 message 변수 값에 넣는다 -->
    </div>
</template>

<script setup>
    import PropsChild from './PropsChild.vue';
    import {ref} from 'vue';

    const message2 = ref('hello');

</script>

<style scoped>

</style>