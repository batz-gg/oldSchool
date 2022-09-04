<template>
  <div>
    <h2>Counter</h2>
    <button class="btn btn-primary" v-on:click="increment">Ихэсгэх</button>
    <button class="btn btn-secondary" v-on:click="decrement">Багасгах</button>

  </div>
</template>

<script>
import { mapMutations } from "vuex";
export default {
  methods: {
    ...mapMutations(['increment', 'decrement'])
    // increment(){
    //   this.$store.commit('increment');
    // },
    // decrement(){
    //   this.$store.commit('decrement');
    // }
  }
}
</script>

<style>

</style>