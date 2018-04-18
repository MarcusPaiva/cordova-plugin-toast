Cordova Plugin Toast
======

Only Android

install:

cordova plugin add https://github.com/MarcusPaiva/cordova-plugin-toast

Sintaxe do javascript:
<script>
  document.addEventListener("deviceready", onDeviceReady, false);
  function onDeviceReady() {
     //TODO: inserir o plugin aqui
     window.Toast.toast("Ola mundo!");
  }
</script>
