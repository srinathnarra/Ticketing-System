<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Email From BookTickets.com</title>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

    <link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>

    <!-- use the font -->
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            font-size: 48px;
        }
    </style>
</head>
<body style="margin: 0; padding: 0;">

    <table align="center" border="0" cellpadding="0" cellspacing="0" width="600" style="border-collapse: collapse;">
        <tr>
            <td align="center" bgcolor="#eaeaea" style="padding: 40px 0 30px 0;">
                
                <p> Sending Email From Book Tickets !!!! </p>
                
            </td>
        </tr>
        <tr>
            <td  style="padding: 40px 30px 40px 30px;">           
                <p bgcolor="#eaeaea"><b>Dear                    : ${name},</b></p>
                <p bgcolor="#eaeaea"><b>Your Bookig Id          : ${bookingid},</b></p>
                <p bgcolor="#eaeaea"><b>Selcted Movie Name      : ${moviename},</b></p>
                <p bgcolor="#eaeaea"><b>Theater Choosen         : ${theatername},</b></p>
                <p bgcolor="#eaeaea"><b>Locality Of The Theater : ${moviearea},</b></p>
                <p bgcolor="#eaeaea"><b>No Of Tickets Booked    : ${nooftkts},</b></p>
                <p bgcolor="#eaeaea"><b>Total Price Payed       : ${totalprice} Rs only ,</b></p>
                <p bgcolor="#eaeaea"><b>Movie Time Choosen      : ${movietime},</b></p>
                <p bgcolor="#eaeaea"><b>Movie Id                : ${movieid},</b></p>  
                <p bgcolor="#eaeaea"><b>Booked Date Of Movie    : ${moviedate}</b></p>             
                           
            </td>
        </tr>
        
        
        <tr>
            <td bgcolor="#777777" style="padding: 30px 30px 30px 30px;">
                <p><b>${signature}</b></p>
                <p><b>${location}</b></p>
            </td>
        </tr>
    </table>
    
          

</body>
</html>