<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro de Funcionários</title>
    <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
    <style>
        
    </style>
</head>
<body>
  <h1>Cadastro de Funcionários</h1>

  <form action="sla.php" method="post">
    <h2>Dados do Funcionário</h2>
      
    <label>Nome do Funcionário</label>
    <input type="text" name="nome_funcionario" required>

    <label>Data de Admissão</label>
    <input type="date" name="data_admissao" required>

    <label>Cargo</label>
    <select name="cargos" required> 
      <option value="Estagiario">Estagiário</option>
      <option value="Desenvolvedor">Desenvolvedor</option>
      <option value="Barista">Barista</option>
      <option value="Tia da limpeza">Tia da limpeza</option>
      <option value="Professor(a)">Professor(a)</option>
      <option value="Médico(a)">Médico(a)</option>
    </select>

    <label>Quantidade de salários mínimos</label>
    <input type="number" name="qtd_salarios_min" min="0" step="0.01">
    <center>
      <button type="submit">Cadastrar</button>
    </center>
  </form>  

  <div class="centered">
      <h1><a href="listagem.php">LISTA</a></h1>
  </div>
</body>
</html>
