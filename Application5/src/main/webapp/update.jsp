<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        label{
            margin-bottom: 30px;
            display: block;
        }
    
        input{
            margin-bottom: 5px;
        }
    </style>
</head>
<body>
    <form action="/updateById">
        <label for="id">Enter the id</label>
        <input type="number" placeholder="enter id" name="id">

        <label for="name">Enter name</label>
        <input type="text" placeholder="name" name="name">
    
        <label for="name">Enter Email</label>
        <input type="email" placeholder="email" name="email">
    
        <label for="phno">Enter Phno No.</label>
        <input type="number" placeholder="number" name="phno">
    <br><br>
        <button type="submit">Update</button>
        
    </form>
</body>
</html>