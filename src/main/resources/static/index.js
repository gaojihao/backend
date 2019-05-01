(function () {

    Vue.component('todo-item', {
        props: ['todo'],
        template: '<li>{{ todo.text }}</li>'
    })

    var app = new Vue({
        el: '#app',
        data: {
            message: 'Hello Vue!',
            groceryList: [
                { id: 0, text: 'Vegetables' },
                { id: 1, text: 'Cheese' },
                { id: 2, text: 'Whatever else humans are supposed to eat' },
                { id: 3, text: '1111' }
            ]
        },

        mounted() {
            this.message = ' app 1111'
        },
    })


})()
