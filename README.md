# cordova-plugin-toast

Ele server para exibir mensagens rápidas e temporais no rodapé do aparelho

Somente Android

### Instalação via linha de comando

 - cordova plugin add https://github.com/MarcusPaiva/cordova-plugin-toast

### Especificando no arquivo no arquivo "plugins.properties" do NetBeans:

 - cordova-plugin-toast=https://github.com/MarcusPaiva/cordova-plugin-toast

## Sintaxe do javascript no projeto:
```
<script>
  document.addEventListener("deviceready", onDeviceReady, false);
  function onDeviceReady() {
     window.Toast.toast("Ola mundo!");
  }
</script>
```

### Funcionalidade futuras

 - Funcionar no IOS
 - Adicionar parâmetro de temporizador do toast ( atualmente apenas ele funciona com a velociade LENGTH_SHORT, pretende-se adicionar LENGTH_SHORT)
 - Adicionar parâmetro de controle de direção na tela por padrão ele fica no canto inferior e centralizado

## Notas de versão

### Versão 1.0

 - Função de exibir apenas um Toast rápido
