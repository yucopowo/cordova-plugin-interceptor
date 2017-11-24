module.exports = {
    getInfo: function (success, error) {
        setTimeout(function () {
            success({
                cordova: 1,
                platform: 1,
                model: 1,
                version: 1,
                uuid: null,
                isVirtual: false
            });
        }, 0);
    },
    greet: function (success, error) {
        success("=======");
    }
};

require('cordova/exec/proxy').add('Interceptor', module.exports);
