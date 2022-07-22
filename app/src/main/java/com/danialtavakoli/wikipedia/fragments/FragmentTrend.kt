package com.danialtavakoli.wikipedia.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.danialtavakoli.wikipedia.activity.MainActivity2
import com.danialtavakoli.wikipedia.adapter.ItemEvents
import com.danialtavakoli.wikipedia.adapter.TrendAdapter
import com.danialtavakoli.wikipedia.data.ItemPost
import com.danialtavakoli.wikipedia.databinding.FragmentTrendBinding

class FragmentTrend : Fragment(), ItemEvents {

    private lateinit var binding: FragmentTrendBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTrendBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val dataTrend = arrayListOf(

            ItemPost(
                "https://dunijet.ir/YaghootAndroidFiles/Wikipedia/john.jpg",
                "John Madden",
                "American football\ncoach and commentator\n(1936-2021)",
                "John Earl Madden (April 10, 1936 – December 28, 2021) was an American football coach and sportscaster. He was the head coach of the Oakland Raiders of the National Football League (NFL) for ten seasons (1969–1978), and guided them to a championship in Super Bowl XI (1977). After retiring from coaching, he served as a color commentator for NFL telecasts until 2009, work for which he won 16 Sports Emmy Awards. From 1988 he lent his name, expertise and color commentary to the John Madden Football (later Madden NFL) video game series.\n" +
                        "\n" +
                        "Madden never had a losing season as a coach, and his overall win percentage is second in NFL history.[1] In recognition of his coaching career, Madden was inducted into the Pro Football Hall of Fame in 2006. As a broadcaster, Madden commentated on all four of the major American television networks: CBS (1979–1993), Fox (1994–2001), ABC (2002–2005), and NBC (2006–2008). He also served as a commercial pitchman for various products and retailers.\n" +
                        "\n" +
                        "A football star in high school, Madden played one season at the College of San Mateo, in 1954, before he was given a football scholarship to the University of Oregon, studying pre-law, and playing football with boyhood friend John Robinson. He was redshirted because of a knee injury and had a knee operation. Then he attended the College of San Mateo in 1955, then Grays Harbor College playing in the fall of 1956, before transferring to Cal Poly in San Luis Obispo, where he played both offense and defense for the Mustangs in 1957 while earning a Bachelor of Science in education in 1959 and a Master of Arts in education in 1961. He won all-conference honors at offensive tackle, and was a catcher on Cal Poly's baseball team.\n" +
                        "\n" +
                        "Madden was drafted in the 21st round (244th overall) by the NFL's Philadelphia Eagles in 1958, but in his first training camp suffered an injury on his other knee, ending his playing career before having had an opportunity to play professionally.\n" +
                        "\n",
                true,
                "+1 M"
            ),

            ItemPost(
                "https://dunijet.ir/YaghootAndroidFiles/Wikipedia/dont_look_up.jpg",
                "Don't Look Up (2021 film)",
                "2021 American satirical\nscience fiction film",
                "Don't Look Up is a 2021 American satirical science fiction film written, produced, and directed by Adam McKay. It stars Leonardo DiCaprio and Jennifer Lawrence as two astronomers attempting to warn humanity, via a media horror, about an approaching comet that will destroy human civilization. Supporting them are Rob Morgan, Jonah Hill, Mark Rylance, Tyler Perry, Timothée Chalamet, Ron Perlman, Ariana Grande, Scott Mescudi, Himesh Patel, Melanie Lynskey, with Cate Blanchett and Meryl Streep.[4] The film is a satire of government and media indifference to the climate crisis.[4][5] Grande and Mescudi also collaborated on the song \"Just Look Up\" as part of the film's soundtrack.[6] The film is dedicated to Hal Willner who died in 2020.\n" +
                        "\n" +
                        "Produced by Hyperobject Industries and Bluegrass Films, the film was announced in November 2019, and sold by Paramount Pictures to Netflix several months later. Lawrence became the first member of the cast to join, with DiCaprio signing on after his discussions with McKay on adjustments to the script; the rest of the cast was added through the rest of 2020. Filming was originally set to begin in April 2020 around the U.S. state of Massachusetts, but was delayed until November due to the ongoing COVID-19 pandemic, and then lasted through February 2021.\n" +
                        "\n" +
                        "Don't Look Up began a limited theatrical release on December 10, 2021, prior to streaming on Netflix on December 24, 2021. It received mixed reviews from critics, who praised the cast but found McKay's approach to the subject heavy handed. Despite the reviews, it was named one of the top ten films of 2021 by the National Board of Review and American Film Institute, and received four nominations at the 79th Golden Globe Awards, including Best Picture – Musical or Comedy, and six at the 27th Critics' Choice Awards, including Best Picture.\n" +
                        "\n",
                true,
                "+362 K"
            ),

            ItemPost(
                "https://dunijet.ir/YaghootAndroidFiles/Wikipedia/harry.jpg",
                "Harry Reid",
                "American politician\n(1939-2021)",
                "Harry Mason Reid Jr , was an American lawyer and politician who served as a United States senator from Nevada from 1987 to 2017. He led the Senate Democratic Caucus from 2005 to 2017 and was the Senate Majority Leader from 2007 to 2015.\n" +
                        "\n" +
                        "Reid began his public career as the city attorney for Henderson, Nevada, before being elected to the Nevada Assembly in 1968. Reid's former boxing coach, Mike O'Callaghan, chose Reid as his running mate in the 1970 Nevada gubernatorial election, and Reid served as Lieutenant Governor of Nevada from 1971 to 1975. After being defeated in races for the United States Senate and mayor of Las Vegas, Reid served as chairman of the Nevada Gaming Commission from 1977 to 1981. From 1983 to 1987, Reid represented Nevada's 1st district in the United States House of Representatives.\n" +
                        "\n" +
                        "Reid was elected to the United States Senate in 1986 and served in the Senate from 1987 to 2017. He served as the Senate Democratic Whip from 1999 to 2005 before succeeding Tom Daschle as Senate Minority Leader. The Democrats won control of the Senate after the 2006 United States Senate elections, and Reid became the Senate Majority Leader in 2007. He held that position for the final two years of George W. Bush's presidency and for the first six years of Barack Obama's presidency. As Majority Leader, Reid helped pass major legislation of the Obama administration, such as the Affordable Care Act, the Dodd–Frank Act, and the American Recovery and Reinvestment Act of 2009. In 2013, under Reid's leadership, the Senate Democratic majority controversially invoked the \"nuclear option\" to eliminate the 60-vote requirement to end a filibuster for presidential nominations, other than nominations to the U.S. Supreme Court.[1] Republicans took control of the Senate following the 2014 United States Senate elections, and Reid served as Senate Minority Leader from 2015 until his retirement in 2017.\n" +
                        "\n" +
                        "Reid was succeeded as the Senate Democratic leader by Chuck Schumer, whose leadership bid had been endorsed by Reid. Along with Alben W. Barkley and Mike Mansfield, Reid was one of only three senators to have served at least eight years as majority leader.\n" +
                        "\n",
                true,
                "+326 K"
            ),

            ItemPost(
                "https://dunijet.ir/YaghootAndroidFiles/Wikipedia/no_way_home.jpg",
                "No Way Home",
                "2021 American\nsuperhero film",
                "Spider-Man: No Way Home is a 2021 American superhero film based on the Marvel Comics character Spider-Man, co-produced by Columbia Pictures and Marvel Studios and distributed by Sony Pictures Releasing. It is the sequel to Spider-Man: Homecoming (2017) and Spider-Man: Far From Home (2019), and the 27th film in the Marvel Cinematic Universe (MCU). The film was directed by Jon Watts and written by Chris McKenna and Erik Sommers. It stars Tom Holland as Peter Parker / Spider-Man alongside Zendaya, Benedict Cumberbatch, Jacob Batalon, Jon Favreau, Jamie Foxx, Willem Dafoe, Alfred Molina, Benedict Wong, Tony Revolori, Marisa Tomei, Andrew Garfield, and Tobey Maguire. In the film, Parker asks Dr. Stephen Strange (Cumberbatch) to make his identity as Spider-Man a secret again with magic after its public revelation in Far From Home, but this breaks open the multiverse and allows supervillains from alternate realities to enter Parker's universe.\n" +
                        "\n" +
                        "A third MCU Spider-Man film was planned during the production of Homecoming in 2017. By August 2019, negotiations between Sony and Marvel Studios to alter their deal—in which they produce the Spider-Man films together—ended with Marvel Studios leaving the project; however, a negative fan reaction led to a new deal between the companies a month later. Watts, McKenna, Sommers, and Holland were set to return at that time. Filming began in October 2020 in New York City before moving to Atlanta that month and wrapping in March 2021. No Way Home explores the concept of the multiverse and ties the MCU to past Spider-Man film series, with numerous actors reprising their roles from the Spider-Man films directed by Sam Raimi and Marc Webb. The return of previous Spider-Man actors Maguire and Garfield was the subject of speculation, and Sony, Marvel, and the cast attempted to conceal their involvement despite numerous leaks.\n" +
                        "\n" +
                        "Spider-Man: No Way Home premiered at the Fox Village Theatre in Los Angeles on December 13, 2021, and was theatrically released in the United States on December 17, as part of Phase Four of the MCU. The film received positive reviews from critics, who praised the story, direction, action sequences, and the cast's performances and chemistry. No Way Home has grossed over \$1.1 billion worldwide, surpassing Spider-Man: Far From Home as the highest-grossing film released by Sony Pictures, in addition to becoming the highest-grossing film of 2021, and the 21st highest-grossing film of all time, and setting several box office records, partly for films released after the onset of the COVID-19 pandemic. A sequel is in development.\n" +
                        "\n",
                true,
                "+302 K"
            ),

            ItemPost(
                "https://dunijet.ir/YaghootAndroidFiles/Wikipedia/matrix.jpg",
                "Matrix Resurrections",
                "2021 American science\nfiction action film",
                "The Matrix Resurrections is a 2021 American science fiction action film produced, co-written, and directed by Lana Wachowski. It is the sequel to The Matrix Revolutions (2003) and the fourth and final installment in The Matrix film franchise. Keanu Reeves, Carrie-Anne Moss, Lambert Wilson, and Jada Pinkett Smith reprise their roles from the previous films, and they are joined by Yahya Abdul-Mateen II, Jessica Henwick, Jonathan Groff, Neil Patrick Harris, and Priyanka Chopra Jonas. The film is set sixty years after the events of Revolutions and follows Neo, who lives a seemingly ordinary life as a video game developer troubled with distinguishing dreams from reality. A group of rebels, with the help of a programmed version of Morpheus, free Neo from an altered Matrix and fight a new enemy that holds Trinity captive.\n" +
                        "\n" +
                        "Following the release of Revolutions, the Wachowskis denied the possibility of another Matrix film, though rumors emerged since then about a possible fourth Matrix film and the studio constantly expressed interest in reviving the franchise, hiring Zak Penn to write a new screenplay after the Wachowskis refused every offer to create more sequels. In late 2019, a fourth Matrix film was finally announced, with Lana Wachowski returning as director without her sister and Reeves and Moss reprising their roles. Filming started in February 2020 but was halted the next month by the COVID-19 pandemic. Wachowski toyed with the possibility of shelving the project and leaving the film unfinished, but the cast insisted that she finish it. Filming resumed in August 2020, concluding three months later.\n" +
                        "\n" +
                        "The Matrix Resurrections premiered in Toronto on December 16, 2021, and was released by Warner Bros. Pictures on December 22, 2021, both theatrically and via the HBO Max streaming service. It has grossed over \$68 million. Critics praised the performances of the cast, though the writing, action scenes, and visuals received some criticism.\n" +
                        "\n",
                true,
                "+198 K"
            ),

            ItemPost(
                "https://dunijet.ir/YaghootAndroidFiles/Wikipedia/margaret.jpg",
                "Margaret Campbell",
                "British socialite",
                "Ethel Margaret Campbell, Duchess of Argyll (née Whigham, thereafter Sweeny; 1 December 1912 – 25 July 1993), was a British socialite best remembered for her much-publicised divorce from her second husband, Ian Campbell, 11th Duke of Argyll, in 1963, which featured salacious photographs and scandalous stories.\n" +
                        "\n" +
                        "Margaret was the only child of Helen Mann Hannay and George Hay Whigham, a Scottish millionaire who was chairman of the Celanese Corporation of Britain and North America. She spent the first 14 years of her life in New York City, where she was educated privately at the Hewitt School. Her beauty was much spoken of, and she had youthful romances with Prince Aly Khan, millionaire aviator Glen Kidston and publishing heir Max Aitken, later the second Lord Beaverbrook.\n" +
                        "\n" +
                        "In 1928 the future actor David Niven, then 18, had sex with 15-year-old Margaret Whigham during a holiday at Bembridge on the Isle of Wight. To the fury of her father, she became pregnant as a result. She was taken into a London nursing home for a secret abortion. \"All hell broke loose,\" remembered her family cook, Elizabeth Duckworth. Margaret did not mention the episode in her 1975 memoirs, but she continued to adore Niven until the day he died. She was among the VIP guests at his London memorial service.\n" +
                        "\n",
                true,
                "+344 K"
            ),

            ItemPost(
                "https://dunijet.ir/YaghootAndroidFiles/Wikipedia/encanto.jpg",
                "Encanto",
                "2021 American animated\nfilm",
                "Encanto is a 2021 American computer-animated musical fantasy comedy film produced by Walt Disney Animation Studios and distributed by Walt Disney Studios Motion Pictures. The 60th film produced by the studio, it was directed by Jared Bush and Byron Howard, co-directed by writer Charise Castro Smith who co-wrote the screenplay with Bush, and produced by Yvett Merino and Clark Spencer, with original songs written by Lin-Manuel Miranda. The film stars the voices of Stephanie Beatriz, María Cecilia Botero, John Leguizamo, Mauro Castillo, Jessica Darrow, Angie Cepeda, Carolina Gaitán, Diane Guerrero, and Wilmer Valderrama. The film premiered at the El Capitan Theatre in Los Angeles on November 3, 2021, and was theatrically released in the United States on November 24 over a 30-day theatrical run, in response to the COVID-19 pandemic. It received positive reviews from critics but has so far underperformed commercially as of December 2021 due to the shortened release frame, grossing over \$194 million.\n" +
                        "\n" +
                        "Forced by an armed conflict to flee her home, young Alma Madrigal loses her husband Pedro but saves her triplet infant children: Julieta, Pepa, and Bruno. Her candle attains magical qualities, and blasts away their pursuers and creates a sentient house, the \"Casita\", for the Madrigals to live in. Fifty years later, a village has grown up under the candle's protection, and the Madrigals are gifted superhuman abilities they use to help the villagers. However, Bruno's gift of precognition causes multiple conflicts that makes the family vilify him, while Mirabel, Julieta's youngest daughter, is treated differently for having no gift at all.\n" +
                        "\n" +
                        "During the evening when Pepa's youngest son Antonio is gifted the ability to speak to animals, Mirabel suddenly sees cracks in the Casita, but her warnings go unheeded when the Casita appears undamaged to the others. Mirabel resolves to save the magic of the Casita. Her super-strong older sister Luisa suggests that Bruno's room, which is located in a forbidden tower in the Casita, may hold some clues to the phenomenon. Inside, Mirabel discovers a cave and recovers pieces of a slab of opaque jade glass which form an image showing her causing the Casita to fall apart. After Mirabel narrowly escapes the cave, Luisa realizes that her family's gifts are starting to weaken.\n" +
                        "\n",
                true,
                "+164 K"
            ),

            ItemPost(
                "https://dunijet.ir/YaghootAndroidFiles/Wikipedia/boxing.jpg",
                "Boxing Day",
                "Commonwealth nations\nholiday on 26 December",
                "Boxing Day is a holiday celebrated after Christmas Day, occurring on the second day of Christmastide.[1] Though it originated as a holiday to give gifts to the poor, today Boxing Day is primarily known as a shopping holiday. It originated in Great Britain and is celebrated in a number of countries that previously formed part of the British Empire. The attached bank holiday or public holiday may take place either on that day or one or two days later (if necessary to ensure it falls on a weekday). Boxing Day is also concurrent with the Catholic holiday Saint Stephen's Day.\n" +
                        "\n" +
                        "In parts of Europe, such as several regions of Spain, Czech Republic, Germany, Hungary, the Netherlands, Italy, Poland, Slovakia, Croatia, Denmark, Finland, Sweden, Belgium, Norway and the Republic of Ireland, 26 December is Saint Stephen's Day, which is considered the second day of Christmas.\n" +
                        "\n",
                true,
                "+430 K"
            ),

            ItemPost(
                "https://dunijet.ir/YaghootAndroidFiles/Wikipedia/james_webb.jpg",
                "James Webb Space",
                "NASA/ESA space\ntelescope launched in\n2021",
                "The James Webb Space Telescope (JWST) is a space telescope developed by NASA with contributions from the European Space Agency (ESA), and the Canadian Space Agency (CSA). The telescope is named after James E. Webb, who was the administrator of NASA from 1961 to 1968 and played an integral role in the Apollo program. It is intended to succeed the Hubble Space Telescope as NASA's flagship mission in astrophysics. JWST was launched on 25 December 2021 on Ariane flight VA256. It is designed to provide improved infrared resolution and sensitivity over Hubble, and will enable a broad range of investigations across the fields of astronomy and cosmology, including observations of some of the most distant events and objects in the Universe such as the formation of the first galaxies, and allowing detailed atmospheric characterization of potentially habitable exoplanets.\n" +
                        "\n" +
                        "The primary mirror of JWST, the Optical Telescope Element, consists of 18 hexagonal mirror segments made of gold-plated beryllium, which combine to create a 6.5 m (21 ft)-diameter mirror – considerably larger than Hubble's 2.4 m (7.9 ft) mirror. Unlike the Hubble telescope, which observes in the near ultraviolet, visible, and near infrared (0.1–1.0 μm) spectra, JWST will observe in a lower frequency range, from long-wavelength visible light (red) through mid-infrared (0.6–28.3 μm). This will enable it to observe high-redshift objects that are too old and too distant for Hubble. The telescope must be kept very cold to observe in the infrared without interference, so it will be deployed in space near the Sun–Earth L2 Lagrange point, about 1.5 million kilometers (930,000 mi) from Earth (0.01 au – 3.9 times the average distance to the Moon).\n" +
                        "\n",
                true,
                "+372 K"
            )
        )
        val myAdapter = TrendAdapter(dataTrend, this)
        binding.recyclerTrend.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        binding.recyclerTrend.adapter = myAdapter
    }

    override fun onItemClicked(itemPost: ItemPost) {
        val intent = Intent(activity, MainActivity2::class.java)
        intent.putExtra(SEND_DATA_TO_SECOND_ACTIVITY, itemPost)
        startActivity(intent)
    }
}