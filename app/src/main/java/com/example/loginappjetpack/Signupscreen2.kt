package com.example.loginappjetpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.loginappjetpack.R
import com.example.loginappjetpack.components.DropdownInputBar
import com.example.loginappjetpack.components.HeroHeading
import com.example.loginappjetpack.components.bars.SearchBar
import com.example.loginappjetpack.components.bars.LocationBar
import com.example.loginappjetpack.components.buttons.SmallButton
import com.example.loginappjetpack.components.buttons.RadioButtonWithLabel
import com.example.loginappjetpack.components.SegmentHeader
import com.example.loginappjetpack.components.bars.BlankBar
import com.example.loginappjetpack.components.bars.InputBar
import com.example.loginappjetpack.components.bars.TimeBar
import com.example.loginappjetpack.components.buttons.CheckboxButton
import com.example.loginappjetpack.components.buttons.LocationButton
import com.example.loginappjetpack.components.buttons.LoginSignupButton
import com.example.loginappjetpack.components.buttons.LoginSignupImgButton
import com.example.loginappjetpack.components.cards.CategoryCard
import com.example.loginappjetpack.components.cards.CompanyCard
import com.example.loginappjetpack.components.cards.ProductCard
import com.example.loginappjetpack.components.cards.ProfileCard
import com.example.loginappjetpack.components.divider.TxtDivider

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignupScreen2() {
    var isChecked by remember { mutableStateOf(false) }
    //GLOBAL BOX
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        //Scrollable Column
        Column(
            modifier = Modifier
                //.padding(start = 16.dp, top = 0.dp, end = 16.dp, bottom = 10.dp)
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            //verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color(0xFF0E64D2),
                                Color.White
                            ),
                        )
                    )
            ){
                Column {
                    //BOX-1
                    Box(
                        modifier = Modifier
                            .padding(top = 1.dp, start = 24.dp, end = 24.dp, bottom = 24.dp)
                            .fillMaxWidth()
                            .height(915.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(color = Color.White),
                    ) {
                        //BOX-1 Column 1
                        Column(
                            modifier = Modifier.fillMaxSize()
                        ) {
                            //Arrow image
                            Image(
                                painter = painterResource(id = R.drawable.leftarrow),
                                contentDescription = "Logo",
                                modifier = Modifier
                                    .padding(top = 12.dp, start = 24.dp)
                                    .height(24.dp)
                                    //.clickable { Something }
                                    .width(24.dp),

                                )
                            //BOX-1 Column 1A
                            Column(
                                modifier = Modifier
                                    .fillMaxSize(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                //verticalArrangement = Arrangement.Center
                            ) {
                                //SIGN UP TEXT
                                Text(
                                    text = "Lets Design Your Website",
                                    style = TextStyle(
                                        fontSize = 26.sp,
                                        textAlign = TextAlign.Center,
                                        fontWeight = FontWeight.W700,
                                        lineHeight = 34.sp,
                                        brush = Brush.linearGradient(
                                            colors = listOf(
                                                Color(0XFF4C3BCF),
                                                Color(0XFF006FEE),
                                                Color(0XFF4285F4)
                                            )
                                        )
                                    ),
                                    modifier = Modifier.padding(bottom = 14.dp, start = 32.dp, end = 32.dp)
                                )

                                //Box-1 Column
                                Column(
                                    modifier = Modifier
                                        .padding(horizontal = 24.dp)

                                ){
                                    //Input Bars

                                    InputBar(
                                        labelText = "Mobile Number",
                                        placeholderText = "",
                                        fontweight = 500,
                                        fontsize = 14
                                    )

                                    InputBar(
                                        labelText = "Email",
                                        placeholderText = "",
                                        fontweight = 500,
                                        fontsize = 14
                                    )

                                    InputBar(
                                        labelText = "Your Business Name",
                                        placeholderText = "",
                                        fontweight = 500,
                                        fontsize = 14
                                    )

                                    InputBar(
                                        labelText = "Type Of Your Business",
                                        placeholderText = "",
                                        fontweight = 500,
                                        fontsize = 14
                                    )

                                    InputBar(
                                        labelText = "Enter Your Business Location",
                                        placeholderText = "",
                                        fontweight = 500,
                                        fontsize = 14,
                                        btmpadding = 8
                                    )

                                    //Location Button
                                    LocationButton(
                                        text = "Enter Your Location",
                                        imageResId = R.drawable.locationpin,
                                        modifier = Modifier.padding(bottom = 6.dp)
                                    )

                                    LoginSignupImgButton(
                                        imageResId = R.drawable.mic,
                                        modifier = Modifier.padding(bottom = 16.dp)
                                    )

                                    InputBar(
                                        labelText = "Address",
                                        placeholderText = "",
                                        fontweight = 500,
                                        fontsize = 14
                                    )

                                    //City and PIN Row
                                    Row (modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(bottom = 20.dp),
                                        horizontalArrangement = Arrangement.SpaceBetween){

                                        InputBar(
                                            labelText = "City",
                                            placeholderText = "",
                                            fontweight = 500,
                                            fontsize = 14,
                                            width = Modifier.width(129.dp),
                                            btmpadding = 0
                                        )

                                        InputBar(
                                            labelText = "PIN",
                                            placeholderText = "",
                                            fontweight = 500,
                                            fontsize = 14,
                                            width = Modifier.width(129.dp),
                                            btmpadding = 0
                                        )
                                    }

                                    LoginSignupButton(height = 48, buttonText = "SUBMIT")
                                }
                            }
                        }
                    }

                    //BOX-2
                    Box(modifier = Modifier
                        .padding(top = 0.dp, start = 24.dp, end = 24.dp)
                        .fillMaxWidth()
                        .height(563.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(color = Color.White),
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 12.dp, bottom = 27.dp, start = 24.dp, end = 24.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Column {
                                //SIGN UP TEXT
                                Text(
                                    text = "Lets Design Your Website",
                                    style = TextStyle(
                                        fontSize = 26.sp,
                                        textAlign = TextAlign.Center,
                                        fontWeight = FontWeight.W700,
                                        lineHeight = 34.sp,
                                        brush = Brush.linearGradient(
                                            colors = listOf(
                                                Color(0XFF4C3BCF),
                                                Color(0XFF006FEE),
                                                Color(0XFF4285F4)
                                            )
                                        )
                                    ),
                                    modifier = Modifier.padding(bottom = 14.dp, start = 32.dp, end = 32.dp)
                                )

                                Column {
                                    //Business Timings
                                    Text(
                                        text = "Business Timings",
                                        fontSize = 14.sp,
                                        lineHeight = 22.sp,
                                        color = Color(0xFF6C7278)
                                    )

                                    //Time Bars
                                    Row (modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(bottom = 16.dp),
                                        horizontalArrangement = Arrangement.SpaceBetween,)
                                    {

                                        TimeBar(
                                            width = 129,
                                            opencloseText = "Open",
                                            timeText = "6:00",
                                            ampmText = "AM",
                                            imageResId = R.drawable.dropdown
                                        )

                                        TimeBar(
                                            width = 129,
                                            opencloseText = "Closed",
                                            timeText = "6:00",
                                            ampmText = "PM",
                                            imageResId = R.drawable.dropdown
                                        )
                                    }

                                    //Number of Off Days
                                    Row (modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(bottom = 3.dp),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Text(
                                            text = "Number of Off Days",
                                            fontSize = 14.sp,
                                            lineHeight = 22.sp,
                                            color = Color(0xFF6C7278)
                                        )

                                        BlankBar(placeholderText = "",
                                            width = Modifier.width(129.dp)
                                        )
                                    }


                                    //DAYS OF WEEK
                                    Row (modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(bottom = 20.dp),
                                        horizontalArrangement = Arrangement.SpaceBetween
                                    ){

                                        CheckboxButton(text = "M",
                                            isChecked = isChecked,
                                            onCheckedChange = { isChecked = it }
                                        )

                                        CheckboxButton(text = "T",
                                            isChecked = isChecked,
                                            onCheckedChange = { isChecked = it }
                                        )

                                        CheckboxButton(text = "W",
                                            isChecked = isChecked,
                                            onCheckedChange = { isChecked = it }
                                        )

                                        CheckboxButton(text = "T",
                                            isChecked = isChecked,
                                            onCheckedChange = { isChecked = it }
                                        )

                                        CheckboxButton(text = "F",
                                            isChecked = isChecked,
                                            onCheckedChange = { isChecked = it }
                                        )

                                        CheckboxButton(text = "S",
                                            isChecked = isChecked,
                                            onCheckedChange = { isChecked = it }
                                        )

                                        CheckboxButton(text = "S",
                                            isChecked = isChecked,
                                            onCheckedChange = { isChecked = it }
                                        )
                                    }

                                    InputBar(
                                        labelText = "GST Number",
                                        placeholderText = "",
                                        fontsize = 14,
                                        fontweight = 500
                                    )

                                    InputBar(
                                        labelText = "About Your Business",
                                        placeholderText = "",
                                        fontsize = 12,
                                        fontweight = 500
                                    )

                                    InputBar(
                                        labelText = "Your Products and Services",
                                        placeholderText = "",
                                        fontsize = 12,
                                        fontweight = 500,
                                        btmpadding = 0
                                    )
                                }
                            }
                        }
                    }
                }
            }

            //Button & text
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ){

                //ADD / LIST YOUR PRODUCT & SERVICES BUTTON
                Button(
                    onClick = { /* Handle button click */ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF2667E8), // Button background color
                        contentColor = Color.White // Text color
                    ),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .width(279.dp)
                        .height(33.dp) // Set the height of the button
                ) {
                    Text(
                        text = "Add / List Your Product & Services",
                        lineHeight = 28.sp,
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight(600)
                        )
                    )
                }

                //Skip Listing Text
                Text(
                    text = "Skip Listing & Enter you QUICK FIX Home Page",
                    color = Color(0xFF4C3BCF),
                    fontWeight = FontWeight(500),
                    fontSize = 14.sp,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            Row(modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 100.dp, top = 78.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Bottom)
            {

                //Already have an account?
                Text(text = "Already have an account?",
                    fontSize = 12.sp,
                    fontWeight = FontWeight(500),
                    modifier = Modifier.padding(end = 6.dp)
                )

                //Login
                Text(text = "Login",
                    fontSize = 12.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF4D81E7),
                    modifier = Modifier.clickable { /* Handle click */ }
                )
            }
        }
    }
}

@Preview(showBackground = true, heightDp = 1700)
@Composable
fun SignupScreen2Preview() {
    Box(
        modifier = Modifier
            .height(1700.dp) // Set height to simulate a screen height
    ) {
        SignupScreen2()
    }
}