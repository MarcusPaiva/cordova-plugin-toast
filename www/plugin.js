
var exec = require('cordova/exec');

var PLUGIN_NAME = 'Toast';

var MyCordovaPlugin = {
  toast:function(phrase) {
    exec(null, null, PLUGIN_NAME, 'toast', [phrase]);
  }
};

module.exports = MyCordovaPlugin;
