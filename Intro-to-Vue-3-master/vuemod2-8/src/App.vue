<template>
  <div class="container">
    <div class="row">
      <div class="col-xs-12 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3" style="margin-top: 20px;">
        <h1> HTTP request </h1>
        <div class="form-group">
          <label> Хэрэглэгчийн нэр </label>
          <input type="text" class="form-control" v-model="user.name"/>
        </div>
        <div class="form-group">
          <label> Хэрэглэгчийн цахим шуудан </label>
          <input type="email" class="form-control" v-model="user.email"/>
        </div>
        <button class="btn btn-primary" v-on:click="submit()">Илгээх</button>
        <br>
        <hr>
        <input type="text" class="form-control" v-model="mode" />
        <button class="btn btn-success" @click="fetchData()">Өгөгдөл авах</button>
        <ul class="list-group">
          <li class="list-group-item" v-for="u in users">
            {{ u.name }} - {{ u.email }}
          </li>
        </ul>
      </div>
    </div>
  </div>
</template>
<script>
  export default {
    name: 'app',
    data () {
      return {
        user: {
          name: '',
          email: ''
        },
        users: [],
        response: {},
        mode: "data"
      };
    },
    methods: {
      submit () {
        // console.log(this.user);
        // this.$http.get('https://vuejs-resource-f838e-default-rtdb.asia-southeast1.firebasedatabase.app/', [config]).then(successCallback, errorCallback);
        // this.$http
        // .post('data.json', this.user).then(
        //   response => {
        //     console.log(response);
        //     console.log(response.status);
        //     console.log(response.statusText);
        //   }, 
        //   error => {
        //     console.log(error);
        //   }
        // );
        this.resource.savePost(this.user);
      },
      fetchData () {
        // this.$http
        //   .get("data.json")
        this.resource.getPost({mode: this.mode}).then(
            response => {
              // console.log(response);
              // const data = response.json();
              return response.json();
              // console.log(data);
            }
          )
          .then(data => {
            const resultArray = [];
            for (let key in data) {
              resultArray.push(data[key]);
            }
            this.users = resultArray;
          });
      }
    },
    created(){
      const customActions = {
        getPost: {method: 'GET'},
        savePost: {method: 'POST', url: 'myText.json'}
      };
      this.resource = this.$resource("{mode}.json", {}, customActions);;
    }
  };
</script>

<style scoped>
</style>