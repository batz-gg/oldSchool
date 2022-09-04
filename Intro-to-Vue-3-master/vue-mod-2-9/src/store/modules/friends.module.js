export const friendsModule = {
    namespaced: true,
    state: {
        friends: ['enum']
    },
    getters: {},
    mutations: {
        addFriend(state, friend){
            state.friends = [friend, ...state.friends]
            // state.friends.push(state.friend);
        }, 
        removeFriend:(state, friendIndex) => {
            state.friends.splice(friendIndex, 1);
        }
    },
    actions: {
        addFriendAction(context){
            context.commit('addFriend', 'test2');
            const alert = {
                message: "Шинэ найз нэмлээ",
                color: 'green'
            }
            context.dispatch('alert', alert, {root: true})
        },
        removeFriendAction(context, index){
            context.commit('removeFriend', index);
            const alert = {
                message: "Найз хаслаа",
                color: 'red'
            }
            context.dispatch('alert', alert, {root: true})
        }
    }
}