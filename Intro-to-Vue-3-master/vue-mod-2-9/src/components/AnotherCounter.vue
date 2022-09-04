<template>
  <div>
    <h2>Another Counter</h2>
    <button class="btn btn-primary" v-on:click="increment">Another Ихэсгэх</button>
    <button class="btn btn-secondary" v-on:click="decrement">Another Багасгах</button>

  </div>
</template>

<script>
import { mapMutations } from 'vuex';
export default {
  methods: {
    ...mapMutations(['increment', 'decrement'])
  }
}
</script>

<style>

</style>