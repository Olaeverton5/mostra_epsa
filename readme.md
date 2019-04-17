### PROJETO MOSTRA EPSA
## Primeira vez usando o projeto
1) instalar o GIT </br>
1.1) em casa: </br>
`https://git-scm.com/download`</br>
1.2) na maquina virtual OVA: </br>
`https://github.com/git-for-windows/git/releases/tag/v2.10.0.windows.1`</br>

2) Após instalado, deve-se CLONAR o projeto em uma pasta escolhida para baixar o código JAVA DA APLICAÇÃO </br>
2.1) abrir CMD na pasta do projeto </br>
2.2) executar o comando: </br>
`git clone https://github.com/Olaeverton5/mostra_epsa.git`</br>

## Se ocorrer alguma falha devido a SSL, porque o computador usa internet através de um PROXY (escola/trabalho) deve-se executar o comando abaixo: </br>
`git config --system http.sslverify false` </br>

## Antes de começar a programar
1) ver issues no site que estão assinadas para sua pessoa
2) Executar o comando:
`git pull`

## Após terminar de programar
1) adicionar arquivos alterados.
`git add * `
2) comentar sobre os arquivos alterados 
`git commit -m "Tela de login e exemplo" ´
3) subir alterações 
`git push`

## Se der problema ao executar o GIT PUSH, realize um GIT PULL primeiro. Se ele der pau, tem problemas na "mesclagem".
