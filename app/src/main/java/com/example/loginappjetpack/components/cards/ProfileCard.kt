package com.example.loginappjetpack.components.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.layout.FlowColumnScopeInstance.align
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Star
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.loginappjetpack.R

@Composable
fun ProfileCard(
    imageRes: Int,
    profileImageRes: Int,
    cwidth: Int,
    cheight: Int,
    mainText: String,
    subText: String,
    iheight: Int,
    hdrowgp: Int,
    profimg: Int,
    hdrowtoppd: Int,
    hdrowstartpd: Int,
    hdrowendpd: Int,
    extraSubText: String,
    starsize: Int,
    sbrowbtnpd: Int,
    sbrowstartpd: Int,
    sbrowendpd: Int
) {
    Card(
        modifier = Modifier
            .width(cwidth.dp)
            .height(cheight.dp),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        )
    ) {
        //global column
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 0.dp)
        ) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(iheight.dp)
            )
            //sub-global column
            Column(
                modifier = Modifier
                    .fillMaxSize(),

            ) {
                //row-1
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = hdrowtoppd.dp, start = hdrowstartpd.dp, end = hdrowendpd.dp),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.spacedBy(hdrowgp.dp)
                ) {
                    //dp
                    Image(
                        painter = painterResource(id = profileImageRes),
                        contentDescription = null,
                        modifier = Modifier
                            .size(profimg.dp)
                            .clip(CircleShape)
                    )
                    Column(
                        verticalArrangement = Arrangement.Top
                    ) {
                        Text(
                            text = mainText,
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontWeight = FontWeight.Bold,
                                color = Color.Black,
                                fontSize = 16.sp,
                                lineHeight = 12.sp
                            )
                        )
                        Text(
                            text = subText,
                            style = MaterialTheme.typography.bodyMedium.copy(
                                fontWeight = FontWeight.Normal,
                                color = Color.Gray,
                                fontSize = 8.sp,
                                lineHeight = 8.sp
                            )
                        )
                    }
                }

                //Row-2
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = sbrowbtnpd.dp, start = sbrowstartpd.dp, end = sbrowendpd.dp, bottom = 5.dp),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Column(
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            text = "Rating",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF939393),
                                lineHeight = 1.sp,
                                fontSize = 8.sp
                            ),
                            modifier = Modifier.padding(bottom = 0.dp)
                        )
                        Row {
                            repeat(4) {
                                Icon(
                                    imageVector = Icons.Filled.Star,
                                    contentDescription = null,
                                    tint = Color(0xFFE4B200),
                                    modifier = Modifier.size(starsize.dp)
                                )
                            }
                            Icon(
                                imageVector = Icons.Outlined.Star,
                                contentDescription = null,
                                tint = Color.Gray,
                                modifier = Modifier.size(starsize.dp)
                            )
                        }
                    }
                    Column(
                        horizontalAlignment = Alignment.End,
                        //verticalArrangement = Arrangement.SpaceAround
                    ) {
                        Text(
                            text = "Distance",
                            modifier = Modifier
                                .fillMaxWidth(),
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF939393),
                                fontSize = 8.sp,
                                textAlign = TextAlign.End,
                                lineHeight = 1.sp
                            )
                        )
                        Text(
                            text = extraSubText,
                            modifier = Modifier
                                .fillMaxWidth(),

                            style = MaterialTheme.typography.bodyMedium.copy(
                                fontWeight = FontWeight.Normal,
                                color = Color(0xFF6D6D6D),
                                fontSize = 7.sp,
                                lineHeight = 16.sp,
                                textAlign = TextAlign.Right

                            )
                        )
                    }
                }

            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileCardPreview() {
    ProfileCard(
        imageRes = R.drawable.lapwork, // Replace with a valid drawable resource
        profileImageRes = R.drawable.userm2, // Replace with a valid drawable resource
        mainText = "John Doe",
        subText = "Developer",
        extraSubText = "5 km",
        cwidth = 200,
        cheight = 300,
        iheight = 150,
        hdrowgp = 8,
        profimg = 40,
        hdrowtoppd = 8,
        hdrowstartpd = 8,
        hdrowendpd = 8,
        starsize = 16,
        sbrowbtnpd = 8,
        sbrowstartpd = 8,
        sbrowendpd = 8
    )
}
