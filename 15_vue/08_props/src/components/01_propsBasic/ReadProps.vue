<template>
    <div>
        <h1>{{ props.readValue }}</h1>    
        <label>자식의 readValue:</label>
        <input type="text" v-model="props.readValue">
    </div>
</template>

<script setup>
    import { defineProps } from 'vue';

    const props = defineProps({
        readValue: String
    });
</script>

<style scoped>

</style>