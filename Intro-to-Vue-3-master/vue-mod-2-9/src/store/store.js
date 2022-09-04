import Vue from 'vue';
import Vuex from 'vuex';
import {friendsModule} from './modules/friends.module';
import {alertModule} from './modules/alert.module';

Vue.use(Vuex);

export const store = new Vuex.Store({
    state: {
        counter: 0,
        firstName: 'Zolboo',
        lastName: 'Talisman'
    },
    getters: {
        doubleCounter: state=>{
            return state.counter * 2;
        },
        stringCounter: state => {
            return state.counter + " Clicks";
        },
        fullName: state => {
            return `${state.firstName} ${state.lastName}`;
        }
    },
    mutations: {
        increment: state => {
            state.counter += 1;
        },
        decrement: state => {
            state.counter -= 1;
        }
    },
    actions: {},
    modules: {
        friendsModule,
        alertModule
    }
});