
# 📌 **Padrão Null Object — Problema e Solução**

O padrão **Null Object** foi criado para resolver um problema muito comum no desenvolvimento de software:
a **proliferação de verificações de null** espalhadas pelo código.

## ❗ Problema: Verificações de null em todos os lugares

Em aplicações tradicionais, quando um método retorna um objeto que *pode* não existir, geralmente ele retorna `null`. Isso obriga o programador a escrever repetidamente coisas como:

```java
User user = repository.findById(id);
if (user != null) {
    user.notify("Olá!");
}
```

Esse padrão traz diversos problemas:

### 🔹 1. Código poluído

O código fica cheio de `if (obj != null)`, o que prejudica clareza e manutenção.

### 🔹 2. Risco de NullPointerException

Se o programador esquecer uma verificação, o sistema falha em tempo de execução.

### 🔹 3. Lógica espalhada

Cada classe precisa saber como lidar com ausência de dados, aumentando o acoplamento.

### 🔹 4. Duplicação de comportamento

Cada ponto do código implementa sua própria “lógica de fallback”.

Resumindo: **o null exige que o consumidor saiba como tratar ausência**, e isso é ruim.

---

## ✅ Solução: Criar um objeto especial que representa a ausência

O padrão Null Object propõe **substituir `null` por um objeto real**, chamado de *null object*, que implementa a mesma interface da classe original, mas com comportamento neutro.

Em vez de:

* retornar `null`
* obrigar o consumidor a checar null

Você retorna, por exemplo:

```java
return new NullUser();
```

Esse `NullUser`:

✔ implementa a mesma interface que `User`
✔ não quebra o sistema
✔ responde a métodos sem causar erro
✔ pode registrar logs, mensagens ou retornar valores padrão
✔ evita necessidade de ifs

### ✨ Resultado

```java
IUser user = repository.findById(id);
user.notify("Olá!"); // Funciona com User OU NullUser
```

Sem `if`, sem NPE, sem lógica duplicada.

---

# 🎯 Em resumo

### **Problema:**

A ausência de objetos obriga o sistema a usar `null`, gerando código repetitivo, risco de exceções e acoplamento desnecessário.

### **Solução:**

Criar um *objeto nulo*, que substitui `null`, encapsula o comportamento de ausência e permite que o código funcione de forma uniforme, limpa e segura.

---
