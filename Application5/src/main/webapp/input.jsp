<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>UserInput</title>
<style>
        label {
            margin-bottom: 5px;
            display: block;
        }

        input {
            margin-bottom: 25px;
        }

        .getbyid{
            background-color: rgb(251, 204, 142);
        }

        .input{
            background-color: antiquewhite;
        }
        .getall{
            background-color: rgba(0, 255, 255, 0.427);
        }
        .delete{
            background-color: rgb(242, 183, 182);
        }
        .update{
            background-color: rgb(241, 182, 242);
        }
    </style>

</head>
<body>
    <form action="saveUser">
        <label for="name">Enter name</label>
    <input type="text" placeholder="name" name="name">

    <label for="name">Enter Email</label>
    <input type="email" placeholder="email" name="email">

    <label for="phno">Enter Phno No.</label>
    <input type="number" placeholder="number" name="phno">
<br><br>
    <button type="submit">submit</button>
    </form>


<hr>
<form action="/getById">
    <h1>Get User By Id</h1>
    <label for="toGet">Enter User Id</label>
    <input type="number" name="id">
    <button type="submit">Submit</button>
</form>


<hr>
<form action="/getAllUsers">
    <h1>To get all Users present in the database press enter</h1>
    <button type="submit">Enter</button>
</form>


<hr>
<form action="/deleteById">
    <h1>Delete By Id</h1>
    <label for="delete">Enter Id of User to be deleted</label>
    <input type="number" name="id">
    <br><br>
    <button type="submit">Delete</button>
</form>


<hr>
<form action="update.jsp">
    <h1>To Update data Enter Update button</h1>
    <button type="submit">Update</button>
</form>
</body>
</html>
