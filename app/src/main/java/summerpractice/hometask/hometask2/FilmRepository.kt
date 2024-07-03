package summerpractice.hometask.hometask2

object FilmRepository {

    val films: List<Film> = listOf(
        Film(
            id = 0,
            title = "The Shawshank Redemption",
            yearIssue = 1994,
            pictureUrl = "https://c0.klipartz.com/pngpicture/167/601/gratis-png-tim-robbins-la-redencion-de-shawshank-la-pelicula-de-green-man-morgan-man-youtube.png",
            information = "Two imprisoned men bond over a number of years, " +
                    "finding solace and eventual redemption through acts of common decency."
        ),
        Film(
            id = 1,
            title = "The Godfather",
            yearIssue = 1972,
            pictureUrl = "https://posterplus.com.au/files/2020/06/b14172.jpg",
            information = "The aging patriarch of an organized crime dynasty transfers " +
                    "control of his clandestine empire to his reluctant son."
        ),
        Film(
            id = 2,
            title = "The Terminator",
            yearIssue = 1984,
            pictureUrl = "https://upload.wikimedia.org/wikipedia/en/8/8a/Dark_Knight.jpg",
            information = "The story of the confrontation between soldier Kyle Reese and cyborg Terminator, "+
                    "who arrived in 1984 from the post-apocalyptic future, where the world is ruled by killer machines, "+
                    "and humanity is on the verge of extinction."

        ),
        Film(
            id = 3,
            title = "Pulp Fiction",
            yearIssue = 1994,
            pictureUrl = "https://vertex-art.ru/wp-content/uploads/%D0%9F%D0%BE%D1%81%D1%82%D0%B5%D1%80%D1%8B/01w.jpg",
            information = "The lives of two mob hitmen, a boxer, a gangster and his wife, " +
                    "and a pair of diner bandits intertwine in four tales of violence and redemption."
        ),
        Film(
            id = 4,
            title = "Forrest Gump",
            yearIssue = 1994,
            pictureUrl = "https://upload.wikimedia.org/wikipedia/en/6/67/Forrest_Gump_poster.jpg",
            information = "The presidencies of Kennedy and Johnson, the events of Vietnam, Watergate, " +
                    "and other historical events unfold from the perspective of an Alabama man with an IQ of 75."
        ),
        Film(
            id = 5,
            title = "Inception",
            yearIssue = 2010,
            pictureUrl = "https://upload.wikimedia.org/wikipedia/en/2/2e/Inception_%282010%29_theatrical_poster.jpg",
            information = "A thief who steals corporate secrets through the use of dream-sharing technology " +
                    "is given the inverse task of planting an idea into the mind of a C.E.O."
        ),
        Film(
            id = 6,
            title = "The Matrix",
            yearIssue = 1999,
            pictureUrl = "https://upload.wikimedia.org/wikipedia/en/c/c1/The_Matrix_Poster.jpg",
            information = "A computer hacker learns from mysterious rebels about the true nature of his reality " +
                    "and his role in the war against its controllers."
        )
    )
}
