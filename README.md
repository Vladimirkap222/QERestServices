Инструкция по запуску 


1. Скачиваете Папку demo 

2. Запускаете проект, открываете любой API тестер (например:Postman), отправляете Post-запрос по адресу "http://localhost:8080/my-api" с JSON телом

Например:

{

    "name": "Vladimir",
    "age": 20,
    "city": "Moscow"
    
}


В ответе получаете JSON с телом 

{

    "message": "Hello, Vladimir! Your age is 20 and you live in Moscow."
    
}
