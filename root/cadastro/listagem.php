<?php

session_start();

include 'conexao.php';


$busca_nome = isset($_POST['busca_nome']) ? $_POST['busca_nome'] : '';
if ($busca_nome != '') {
    $busca_nome = mysql_real_escape_string($busca_nome);
    $sql = mysql_query("SELECT * FROM funcionarios WHERE nome LIKE '{$busca_nome}%' ORDER BY nome ASC");
} else {
    $sql = mysql_query("SELECT * FROM funcionarios ORDER BY nome ASC");
}

if (isset($_GET['apagar'])) {
    $nome = mysql_real_escape_string($_GET['apagar']);
    mysql_query("DELETE FROM funcionarios WHERE nome='{$nome}'");
    
    $_SESSION['message'] = "Usuário excluído com sucesso!";
    
    header("Location: listagem.php");
    exit();
}

?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Listagem de Funcionários</title>
    <link href="style_listagem.css" rel="stylesheet" type="text/css" media="screen" />
</head>
<body>
    <div class="container">
        <h1>Listagem de Funcionários</h1>

        <?php
        if (isset($_SESSION['message'])) {
            echo "<div class='alert success'>{$_SESSION['message']}</div>";
            unset($_SESSION['message']);
        }
        ?>

        <form name="form1" method="POST" action="listagem.php">
            DIGITE UM USUÁRIO: <input type="text" name="busca_nome">
            <input type="submit" value="FILTRAR">
        </form>

        <table>
            <tr>
                <th>Registro</th>
                <th>Nome</th>
                <th>Data de Admissão</th>
                <th>Cargo</th>
                <th>Quantidade Salários Mínimos</th>
                <th>INSS</th>
                <th>Salário Bruto</th>
                <th>Salário Líquido</th>
                <th>Excluir</th>
            </tr>
            <?php while ($linha = mysql_fetch_assoc($sql)) { ?>
                <tr>
                    <td><?php echo htmlspecialchars($linha['registro']); ?></td>
                    <td><?php echo htmlspecialchars($linha['nome']); ?></td>
                    <td><?php echo htmlspecialchars($linha['data_admissao']); ?></td>
                    <td><?php echo htmlspecialchars($linha['cargo']); ?></td>
                    <td><?php echo htmlspecialchars($linha['qtde_salarios']); ?></td>
                    <td><?php echo htmlspecialchars($linha['inss']); ?></td>
                    <td><?php echo htmlspecialchars($linha['salario_bruto']); ?></td>
                    <td><?php echo htmlspecialchars($linha['salario_liquido']); ?></td>
                    <td><a href="listagem.php?apagar=<?php echo urlencode($linha['nome']); ?>" onclick="return confirm('Tem certeza de que deseja excluir este usuário?');">Excluir</a></td>
                </tr>
            <?php } ?>
        </table>

        <div class="centered">
            <a href="cadastro.php">Voltar para o Cadastro</a>
        </div>
    </div>
</body>
</html>
