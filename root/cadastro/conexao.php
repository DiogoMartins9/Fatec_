<?php
$servidor = "localhost";
$usuario = "root";
$senha = "usbw";
$banco = "2dsm_24_2s";

$conecta_db = mysql_connect($servidor, $usuario, $senha) or die (mysql_error());

mysql_select_db($banco) or die ("Erro ao conectar no DB");

?>