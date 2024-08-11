import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.loginappjetpack.R
import com.example.loginappjetpack.components.HeroHeading
import com.example.loginappjetpack.components.bars.SearchBar
import com.example.loginappjetpack.components.bars.LocationBar
import com.example.loginappjetpack.components.buttons.SmallButton
import com.example.loginappjetpack.components.buttons.RadioButtonWithLabel
import com.example.loginappjetpack.components.SegmentHeader
import com.example.loginappjetpack.components.cards.CategoryCard
import com.example.loginappjetpack.components.cards.ProductCard
import com.example.loginappjetpack.components.cards.ProfileCard

@Composable
fun Homescreen() {
    var selectedOption by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    )
    {
        // Scrollable Column
        Column(
            modifier = Modifier
                //.padding(start = 16.dp, top = 0.dp, end = 16.dp, bottom = 10.dp)
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(322.dp)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color(0xFF4B3BCF),
                                Color.White
                            ),
                        )
                    )
            ) {

                Column(
                    modifier = Modifier
                        .padding(start = 16.dp, bottom = 0.dp, end = 16.dp)
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState()),
                    //horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    // LOGO AND BUTTONS ROW
                    Row(
                        modifier = Modifier
                            .padding(top = 7.dp)
                            .fillMaxWidth()
                            .height(100.dp), // Specify the desired height here
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(100.dp)
                    ) {
                        Column(
                            modifier = Modifier.height(100.dp), // Ensure the column also respects the height
                            verticalArrangement = Arrangement.SpaceEvenly,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.bimpailogo),
                                contentDescription = "Logo",
                                modifier = Modifier.size(53.dp)
                            )
                            Text(
                                text = "BIMPAI",
                                fontSize = 9.sp,
                                color = Color.White,
                                fontWeight = FontWeight.Medium
                            )
                        }
                        //Spacer(modifier = Modifier.width(100.dp))
                        Column(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .weight(1f),
                                horizontalArrangement = Arrangement.spacedBy(6.dp, Alignment.End)
                            ) {
                                SmallButton(
                                    text = "Log In",
                                    color = Color.White,
                                    fontSize = 11,
                                    textColor = Color(0xFF4b3bcf),
                                    borderColor = Color(0xFF4b3bcf),
                                    borderRoundness = 15,
                                    buttonWidth = 80,
                                    buttonHeight = 40,
                                    onClick = { /* Handle click */ }
                                )
                                SmallButton(
                                    text = "Create Account",
                                    color = Color(0xFFA8FF51),
                                    fontSize = 8,
                                    textColor = Color(0xFF4b3bcf),
                                    borderColor = Color.Transparent,
                                    borderRoundness = 15,
                                    buttonWidth = 80,
                                    buttonHeight = 40,
                                    onClick = { /* Handle click */ }
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .weight(1f),
                                horizontalArrangement = Arrangement.spacedBy(9.dp)
                            ) {
                                RadioButtonWithLabel(
                                    label = "English",
                                    radiotxtsize = 10,
                                    isSelected = selectedOption == "English",
                                    onClick = { selectedOption = "English" }
                                )
                                RadioButtonWithLabel(
                                    label = "Hindi",
                                    radiotxtsize = 10,
                                    isSelected = selectedOption == "Hindi",
                                    onClick = { selectedOption = "Hindi" }
                                )
                                RadioButtonWithLabel(
                                    label = "Bengali",
                                    radiotxtsize = 10,
                                    isSelected = selectedOption == "Bengali",
                                    onClick = { selectedOption = "Bengali" }
                                )
                            }
                        }
                    }

                    // SEARCHBAR
                    //Spacer(modifier = Modifier.height(20.dp))
                    SearchBar(placeholder = "Search Business / Products etc")

                    // ADDRESSBAR
                    //Spacer(modifier = Modifier.height(20.dp))
                    LocationBar(placeholder = "Newtown")

                    // HEROTEXT
                    //Spacer(modifier = Modifier.height(20.dp))
                    HeroHeading(leftText = "Good Morning,")
                }
            }

            //BOX-2
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Column(
                    modifier = Modifier
                        .padding(start = 16.dp, top = 0.dp, end = 16.dp, bottom = 10.dp)
                        .fillMaxSize()
                        //.verticalScroll(rememberScrollState()),
                    //horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    // VIDEOCARD
                    //Spacer(modifier = Modifier.height(5.dp))
                    YoutubePlayer(
                        youtubeVideoId = "V0qki9OqyZ8",
                        lifecycleOwner = LocalLifecycleOwner.current
                    )

                    // SEGMENTHEADING
                    //Spacer(modifier = Modifier.height(20.dp))
                    SegmentHeader(leftText = "Popular Categories")

                    // CATEGORIES
                    //Spacer(modifier = Modifier.height(10.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .horizontalScroll(rememberScrollState()),
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        CategoryCard(
                            vector = ImageVector.vectorResource(id = com.example.loginappjetpack.R.drawable.resturant),
                            text = "Restaurant",
                            onClick = { /* Do something */ }
                        )
                        CategoryCard(
                            vector = ImageVector.vectorResource(id = com.example.loginappjetpack.R.drawable.retailshops),
                            text = "Retail Shops",
                            onClick = { /* Do something */ }
                        )
                        CategoryCard(
                            vector = ImageVector.vectorResource(id = com.example.loginappjetpack.R.drawable.homecleaners),
                            text = "Home Cleaners",
                            onClick = { /* Do something */ }
                        )
                        CategoryCard(
                            vector = ImageVector.vectorResource(id = com.example.loginappjetpack.R.drawable.boutique),
                            text = "Boutique",
                            onClick = { /* Do something */ }
                        )
                        CategoryCard(
                            vector = ImageVector.vectorResource(id = com.example.loginappjetpack.R.drawable.groceries),
                            text = "Groceries",
                            onClick = { /* Do something */ }
                        )
                    }

                    // SEGMENTHEADING
                    //Spacer(modifier = Modifier.height(20.dp))
                    SegmentHeader(leftText = "Trending Products and Services in BIMPAI", leftTextWidth = 200, lineHeight = 20)

                    //PRODUCTCARDS
                    //Spacer(modifier = Modifier.height(10.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .horizontalScroll(rememberScrollState()),
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        ProductCard(
                            imageRes = R.drawable.lapwork,
                            mainText = "TARA MAA Pharmacy",
                            subText = "Udilip 300 " +
                                    "9900000001 " +
                                    "abc@gmail.com " +
                                    "South Dumdum; Kol-700074 " +
                                    "1 strip " +
                                    "349.0 ",
                            buttonText = "Explore",
                            onButtonClick = { /* Handle button click */ }


                        )
                        ProductCard(
                            imageRes = R.drawable.lapwork,
                            mainText = "Arova Fation",
                            subText = "Girl's Dress (Trendy Modern) " +
                                    "9900000002 " +
                                    "def@gmail.com " +
                                    "South Dumdum; Kol-700074 " +
                                    " 1 pc " +
                                    "999.0",
                            buttonText = "Explore",
                            onButtonClick = { /* Handle button click */ }
                        )
                        ProductCard(
                            imageRes = R.drawable.lapwork,
                            mainText = "Main Text 3",
                            subText = "Sub Text 3",
                            buttonText = "Explore",
                            onButtonClick = { /* Handle button click */ }
                        )
                    }

                    // SEGMENTHEADING
                    //Spacer(modifier = Modifier.height(20.dp))
                    SegmentHeader(leftText = "Nearby BIMPAI profiles", leftTextWidth = 200, lineHeight = 20)

                    //Spacer(modifier = Modifier.height(10.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        Column(
                            modifier = Modifier.weight(1.5f),
                            verticalArrangement = Arrangement.spacedBy(10.dp)

                        ) {
                            ProfileCard(
                                imageRes = R.drawable.lapwork,
                                profileImageRes = R.drawable.userm2,
                                mainText = "TARA MAA Pharmacy",
                                extraSubText = "6.8 KM",
                                cwidth = 188,
                                cheight = 227,
                                iheight = 97,
                                hdrowgp = 3,
                                profimg = 24,
                                hdrowtoppd = 8,
                                hdrowstartpd = 8,
                                hdrowendpd = 16,
                                subText = "Udilip 300 " +
                                        "9900000001 " +
                                        "abc@gmail.com " +
                                        "South Dumdum; Kol-700074 " +
                                        "pharmacy" +
                                        "Retail Medicine Shop " +
                                        "349.0 " +
                                        "120 Mtr. From your location",
                                starsize = 13,
                                sbrowbtnpd = 15,
                                sbrowstartpd = 12,
                                sbrowendpd = 9


                            )
                            ProfileCard(
                                imageRes = R.drawable.lapwork,
                                profileImageRes = R.drawable.userm2,
                                mainText = "Arova Fashion",
                                extraSubText = "6.8 KM",
                                cwidth = 188,
                                cheight = 227,
                                iheight = 97,
                                hdrowgp = 3,
                                profimg = 24,
                                hdrowtoppd = 8,
                                hdrowstartpd = 8,
                                hdrowendpd = 16,
                                subText = "Girl's Dress (Trendy Modern) " +
                                        "Arova Fation " +
                                        "9900000002 " +
                                        "def@gmail.com " +
                                        "South Dumdum; Kol-700074 " +
                                        "1 pc " +
                                        "999.0",
                                starsize = 13,
                                sbrowbtnpd = 15,
                                sbrowstartpd = 12,
                                sbrowendpd = 9

                            )
                        }
                        Column(
                            modifier = Modifier.weight(1f),
                            verticalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            ProfileCard(
                                imageRes = R.drawable.lapwork,
                                profileImageRes = R.drawable.userm2,
                                mainText = "Arindam AC Service",
                                extraSubText = "6.8 KM",
                                cwidth = 188,
                                cheight = 145,
                                iheight = 55,
                                hdrowgp = 6,
                                profimg = 13,
                                hdrowtoppd = 5,
                                hdrowstartpd = 5,
                                hdrowendpd = 4,
                                subText = "A1 AC Servicing or Repair Work " +
                                        "9900000003 " +
                                        "def@gmail.com ",
                                starsize = 9,
                                sbrowbtnpd = 11,
                                sbrowstartpd = 6,
                                sbrowendpd = 5

                            )
                            ProfileCard(
                                imageRes = R.drawable.lapwork,
                                profileImageRes = R.drawable.userm2,
                                mainText = "Anonymus",
                                extraSubText = "6.8 KM",
                                cwidth = 188,
                                cheight = 145,
                                iheight = 55,
                                hdrowgp = 6,
                                profimg = 13,
                                hdrowtoppd = 5,
                                hdrowstartpd = 5,
                                hdrowendpd = 4,
                                subText = "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum",
                                starsize = 9,
                                sbrowbtnpd = 11,
                                sbrowstartpd = 6,
                                sbrowendpd = 5

                            )
                            ProfileCard(
                                imageRes = R.drawable.lapwork,
                                profileImageRes = R.drawable.userm2,
                                mainText = "Anonymus",
                                extraSubText = "6.8 KM",
                                cwidth = 188,
                                cheight = 145,
                                iheight = 55,
                                hdrowgp = 6,
                                profimg = 13,
                                hdrowtoppd = 5,
                                hdrowstartpd = 5,
                                hdrowendpd = 4,
                                subText = "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum",
                                starsize = 9,
                                sbrowbtnpd = 11,
                                sbrowstartpd = 6,
                                sbrowendpd = 5

                            )
                        }
                    }
                }
            }

        }
    }
}

@Preview(showBackground = true, heightDp = 2000)
@Composable
fun HomeScreenPreview() {
    Box(
        modifier = Modifier
            .height(2000.dp) // Set height to simulate a screen height
    ) {
        Homescreen()
    }
}
