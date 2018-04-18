
var exec = require('cordova/exec');

var PLUGIN_NAME = 'Toast';

var MyCordovaPlugin = {
//  echo: function(phrase, cb) {
//    exec(cb, null, PLUGIN_NAME, 'echo', [phrase]);
//  },
//  getDate: function(cb) {
//    exec(cb, null, PLUGIN_NAME, 'getDate', []);
//  },
  toast:function(phrase) {
    exec(null, null, PLUGIN_NAME, 'toast', [phrase]);
  }
};

module.exports = MyCordovaPlugin;
