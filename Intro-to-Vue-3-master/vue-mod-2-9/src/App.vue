<template>
  <div class="col-xs-12 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
    <h1>Тоолуур</h1>
    <h2>Alert</h2>
    <h3 v-bind:style="color">{{message}}</h3>
    <!-- <br> -->
    <app-result />
    <app-another-result />
    <hr>
    <app-counter />
    <app-another-counter />
  </div>
</template>

<script>
import Counter from "./components/Counter.vue";
import anotherCounter from "./components/AnotherCounter.vue";
import Result from "./components/Result.vue";
import anotherResult from "./components/AnotherResult";
export default {
  name: 'app',
  components: {
    appCounter: Counter,
    appAnotherCounter: anotherCounter,
    appResult: Result,
    appAnotherResult: anotherResult
  },
  computed: {
    color(){
      return `color: ${this.$store.state.alertModule.color}`;
    },
    message(){
      return this.$store.state.alertModule.message;
    }
  }
}
</script>