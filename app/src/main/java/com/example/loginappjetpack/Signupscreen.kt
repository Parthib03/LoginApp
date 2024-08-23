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
import androidx.compose.material3.Text
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
import com.example.loginappjetpack.components.bars.InputBar
import com.example.loginappjetpack.components.buttons.LoginSignupButton
import com.example.loginappjetpack.components.cards.CategoryCard
import com.example.loginappjetpack.components.cards.CompanyCard
import com.example.loginappjetpack.components.cards.ProductCard
import com.example.loginappjetpack.components.cards.ProfileCard
import com.example.loginappjetpack.components.divider.TxtDivider

@Composable
fun SignupScreen() {
    //GLOBAL BOX
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF0E64D2),
                        Color.White
                    ),
                )
            )
    ) {
        //Scrollable Column
        Column(
            modifier = Modifier
                //.padding(start = 16.dp, top = 0.dp, end = 16.dp, bottom = 10.dp)
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            //BOX-1
            Box(modifier = Modifier
                .padding(top = 1.dp, start = 24.dp, end = 24.dp, bottom = 34.dp)
                .fillMaxWidth()
                .height(716.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(color = Color.White),
            ){
                //BOX-1 Column 1
                Column (
                    modifier = Modifier.fillMaxSize()
                ){
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
                    Column (
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        //verticalArrangement = Arrangement.Center
                    ){
                        //SIGN UP TEXT
                        Text(text = "Sign Up",
                            style = TextStyle(fontSize = 26.sp,
                                fontWeight = FontWeight.W700,
                                lineHeight = 34.sp,
                                brush = Brush.linearGradient(
                                    colors = listOf(Color(0XFF4C3BCF),Color(0XFF006FEE),Color(0XFF4285F4))
                                )
                            ),
                            modifier = Modifier.padding(bottom = 10.dp)
                        )

                        //COMPANY CARDS
                        Column (
                            verticalArrangement = Arrangement.spacedBy(18.dp)
                        ){
                            CompanyCard(
                                bgColor = Color(0xFFF1F1F1),
                                height = 45,
                                width = Modifier.width(247.dp),
                                text1 = "Google",
                                imageResId = R.drawable.google, // Ensure this drawable exists
                                textColor = Color.Black
                            )
                            CompanyCard(
                                bgColor = Color(0xFFF1F1F1),
                                height = 45,
                                width = Modifier.width(247.dp),
                                text1 = "Facebook",
                                imageResId = R.drawable.facebook, // Ensure this drawable exists
                                textColor = Color.Black
                            )
                        }

                        //OR component
                        TxtDivider(
                            text = "Or",
                            textColor = Color(0xFF6C7278),
                            dividerColor = Color(0xFFEDF1F3),
                            textSize = 12

                        )

                        Column(
                            modifier = Modifier
                                .padding(horizontal = 24.dp)

                        ){

                            //Dropdown Input Bar
                            DropdownInputBar(
                                labelText = "Country",
                                placeholderText = "India",
                                image = painterResource(id = R.drawable.dropdown) // Replace with your drawable resource
                            )

                            //Email or Phone Number Input Bar
                            InputBar(
                                labelText = "Email or Phone Number",
                                placeholderText = "",
                                fontweight = 500,
                                fontsize = 14
                                )

                            //OTP and Button Row
                            Row (
                                modifier = Modifier
                                    .padding(bottom = 3.dp)
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(7.dp),
                                verticalAlignment = Alignment.Bottom,
                            ){

                                InputBar(
                                    labelText = "OTP",
                                    btmpadding = 0,
                                    placeholderText = "",
                                    width = Modifier.width(152.dp),
                                    fontweight = 500,
                                    fontsize = 14
                                )

                                SmallButton(
                                    text = "Verify",
                                    color = Color(0xFF2667E8),
                                    fontSize = 14,
                                    textColor = Color(0xFFFFFFFF),
                                    borderWidth = 0,
                                    borderColor = Color.Transparent,
                                    borderRoundness = 10,
                                    buttonWidth = 120,
                                    buttonHeight = 45,
                                    textWeight = 500,
                                    onClick = { /* Handle click */ }
                                )
                            }

                            //Resend OTP
                            Text(text = "Resend OTP",
                                fontSize = 10.sp,
                                color = Color(0xFF939393),
                                fontWeight = FontWeight(500),
                                modifier = Modifier
                                    .clickable { /* Handle click */ }
                                    .padding(bottom = 3.dp, start = 8.dp)
                            )

                            //Acount type row
                            Row (
                                modifier = Modifier
                                    .padding(bottom = 16.dp)
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically,
                            ){
                                Text(text = "Account Type",
                                    fontSize = 14.sp,
                                    lineHeight = 20.sp,
                                    color = Color(0xFF939393),
                                )

                                Box(modifier = Modifier
                                    .height(45.dp)
                                    .width(175.dp)
                                    .border(1.dp, Color(0xFF4C3BCF), RoundedCornerShape(10.dp))
                                ){
                                    Row (
                                        modifier = Modifier.fillMaxSize(),
                                        horizontalArrangement = Arrangement.SpaceEvenly                                ) {
                                        //Radio Buttons
                                        RadioButtonWithLabel(
                                            label = "Business",
                                            isSelected = true,
                                            radiotxtsize = 12,
                                            radiobtnwidth = 2,
                                            onClick = { /* Handle click */ },
                                            radiotxtcolor = Color(0xFF656565),
                                            radioselectedcolor = Color(0xFF006FEE),
                                            radiounselectedcolor = Color(0xFF006FEE)
                                        )

                                        RadioButtonWithLabel(
                                            label = "Personal",
                                            isSelected = false,
                                            radiotxtsize = 12,
                                            radiobtnwidth = 2,
                                            onClick = { /* Handle click */ },
                                            radiotxtcolor = Color(0xFFDFDFDF),
                                            radioselectedcolor = Color(0xFFD4D4D8),
                                            radiounselectedcolor = Color(0xFFD4D4D8)
                                        )
                                    }
                                }
                            }

                            InputBar(
                                labelText = "Business Name / Name Of the account Creator",
                                btmpadding = 20,
                                placeholderText = "",
                                fontweight = 500,
                                fontsize = 14
                            )

                            LoginSignupButton(
                                height = 48, // Height of the button
                                buttonText = "SUBMIT" // Button text
                            )
                        }
                    }
                }
            }

            //BOX-2
            Box(modifier = Modifier
                .padding(top = 0.dp, start = 24.dp, end = 24.dp, bottom = 100.dp)
                .fillMaxWidth()
                .height(334.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(color = Color.White),
            ) {
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 14.dp, bottom = 27.dp, start = 24.dp, end = 24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){

                    //PIN Text
                    Text(text = "Set Up Your PIN",
                        style = TextStyle(
                            fontSize = 26.sp,
                            lineHeight = 30.sp),
                        modifier = Modifier.padding(bottom = 14.dp)
                    )

                    //PIN Input Bar
                    InputBar(
                        labelText = "Choose PIN/Password",
                        btmpadding = 16,
                        placeholderText = "(4 Digit or Letter or Digi-letter)",
                        fontweight = 500,
                        fontsize = 14
                    )

                    //PIN Confirm Bar
                    InputBar(
                        labelText = "Confirm PIN/Password",
                        btmpadding = 20,
                        placeholderText = "(4 Digit or Letter or Digi-letter)",
                        fontweight = 500,
                        fontsize = 14
                    )

                    //Set PIN button
                    LoginSignupButton(
                        height = 48, // Height of the button
                        buttonText = "SET PIN" // Button text
                    )

                    //Login Row
                    Row (
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically,

                    ){
                        Text(text = "Already have an account?",
                            fontSize = 12.sp,
                            lineHeight = 17.sp,
                            color = Color(0xFF6C7278),
                        )

                        Text(text = "Login",
                            fontSize = 12.sp,
                            fontWeight = FontWeight(600),
                            color = Color(0xFF4D81E7),
                            modifier = Modifier.padding(start = 6.dp)
                        )

                    }
                }
            }
        }

    }
}


@Preview(showBackground = true, heightDp = 1120)
@Composable
fun SignupScreenPreview() {
    Box(
        modifier = Modifier
            .height(1120.dp) // Set height to simulate a screen height
    ) {
        SignupScreen()
    }
}


