Type=StaticCode
Version=4.2
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
	Dim thiskvs As KeyValueStore
End Sub

Sub createunencrypted2
	If thiskvs.IsInitialized = False Then
		thiskvs.Initialize(Main.GetDataFolder("KVSViewer"), "kvs2_example_unencrypted.dat")
	End If
	Dim mapTest As Map
	mapTest.Initialize
	mapTest.Put("Name", "Jim Melanson")
	mapTest.Put("Email", "jmelanson1965@gmail.com")
	mapTest.Put("City", "Cobourg")
	mapTest.Put("Province", "Ontario")
	mapTest.Put("Postal Code", "K9A-4J8")
	mapTest.Put("Bio URL", "https://about.me/jim.melanson")
	mapTest.Put("Writing website", "http://www.jimmelanson.ca")
	thiskvs.Put("Contact Details as Map", mapTest)
	Dim strBio As String
	strBio = "Poet, programmer, procrastinator, sci-fi geek, coffee snob, actor, writer."
	strBio =  strBio & CRLF & CRLF & "A devoted Christian, Jim is a quiet and thoughtful man who tends to think deeply and act slowly. Much of this inner reflection and self-assessment shows up in his writing. “Capturing what truly motivates us,” is how Jim describes his approach to both fiction and non-fiction. With a passion for sci-fi (Edgar Rice Burroughs is his favourite sci-fi author) and for non-fiction Christian literature, Jim explores both with his writing. This author has a very direct and sometimes in-your-face way of writing. He tries to always use conversational language and as one test reader of a work in progress put it, 'made the complexities of space flight seem almost understandable.'"
	strBio =  strBio & CRLF & CRLF & "Jim was born on the East Coast of Canada. He grew up on a small island in the Bay of Fundy called Campobello Island. His teenage years were spent in the bustling seaport city of Saint John, NB and in the west island area of Montreal, PQ. Jim read his first novel by Laura Ingalls Wilder at the age of eight and this began his love affair with the written word. While mostly writing for school and in his later years the workplace, Jim’s first foray into personal writing as a child was poetry. These and other poetic scribbling’s provided the content for his first book, I Apologize for Nothing, self-published in April, 2014."
	strBio =  strBio & CRLF & CRLF & "Trying his hand at short stories, Jim didn’t pursue this as far as he wanted to. Life, a child, a career with the Police Service and a part-time business authoring software all got in the way. In his 40’s, Jim turned his hand back to writing, mainly on topics surrounding self-development, spirituality, and Reiki. None of these really satisfied that craving for creativity. In 2013, Jim decided to pursue his creative yearnings and began writing for pleasure. Drawing on a solid work ethic from his experience authoring technical manuals and writing business proposals, Jim found writing for himself to be liberating and enjoyable. While working on his first fiction novel, he kept getting sidetracked by other ideas. He dusted off an old stage play he had written and published this under the title Mama’s Slippers, with the hopes of attracting production interest. He currently continues work on both science fiction and Christian themed projects."
	strBio =  strBio & CRLF & CRLF & "Jim is single and shares his home with his cat Cleo. They live in a small comfortable home just outside Cobourg."
	thiskvs.Put("Multiline Biography", strBio)
	thiskvs.Put("Single line", "Leadership is the art of getting people to do what you want them to do, without them realizing you want them to do it. - Winston Churchill")
	Dim listTemp As List
	listTemp.Initialize
	listTemp.Add("Red")
	listTemp.Add("Orange")
	listTemp.Add("Yellow")
	listTemp.Add("Green")
	listTemp.Add("Blue")
	listTemp.Add("Indigo")
	listTemp.Add("Violet")
	listTemp.Add("Mnemonic: Run, Oh You Great Big Irish Varlet")
	thiskvs.Put("A Big Prime Number", 108293)
	thiskvs.Put("Colour List", listTemp)
	thiskvs.Put("This file is unencrypted", "True")
	thiskvs.Close
End Sub

Sub createencrypted2
	thiskvs.Initialize(Main.GetDataFolder("KVSViewer"), "kvs2_example_encrypted.dat")
	Dim mapTest As Map
	mapTest.Initialize
	mapTest.Put("Name", "Jim Melanson")
	mapTest.Put("Email", "jmelanson1965@gmail.com")
	mapTest.Put("City", "Cobourg")
	mapTest.Put("Province", "Ontario")
	mapTest.Put("Postal Code", "K9A-4J8")
	mapTest.Put("Bio URL", "https://about.me/jim.melanson")
	mapTest.Put("Writing website", "http://www.jimmelanson.ca")
	thiskvs.PutEncrypted("Contact Details as Map", mapTest, "1357")
	Dim strBio As String
	strBio = "Poet, programmer, procrastinator, sci-fi geek, coffee snob, actor, writer."
	strBio =  strBio & CRLF & CRLF & "A devoted Christian, Jim is a quiet and thoughtful man who tends to think deeply and act slowly. Much of this inner reflection and self-assessment shows up in his writing. “Capturing what truly motivates us,” is how Jim describes his approach to both fiction and non-fiction. With a passion for sci-fi (Edgar Rice Burroughs is his favourite sci-fi author) and for non-fiction Christian literature, Jim explores both with his writing. This author has a very direct and sometimes in-your-face way of writing. He tries to always use conversational language and as one test reader of a work in progress put it, 'made the complexities of space flight seem almost understandable.'"
	strBio =  strBio & CRLF & CRLF & "Jim was born on the East Coast of Canada. He grew up on a small island in the Bay of Fundy called Campobello Island. His teenage years were spent in the bustling seaport city of Saint John, NB and in the west island area of Montreal, PQ. Jim read his first novel by Laura Ingalls Wilder at the age of eight and this began his love affair with the written word. While mostly writing for school and in his later years the workplace, Jim’s first foray into personal writing as a child was poetry. These and other poetic scribbling’s provided the content for his first book, I Apologize for Nothing, self-published in April, 2014."
	strBio =  strBio & CRLF & CRLF & "Trying his hand at short stories, Jim didn’t pursue this as far as he wanted to. Life, a child, a career with the Police Service and a part-time business authoring software all got in the way. In his 40’s, Jim turned his hand back to writing, mainly on topics surrounding self-development, spirituality, and Reiki. None of these really satisfied that craving for creativity. In 2013, Jim decided to pursue his creative yearnings and began writing for pleasure. Drawing on a solid work ethic from his experience authoring technical manuals and writing business proposals, Jim found writing for himself to be liberating and enjoyable. While working on his first fiction novel, he kept getting sidetracked by other ideas. He dusted off an old stage play he had written and published this under the title Mama’s Slippers, with the hopes of attracting production interest. He currently continues work on both science fiction and Christian themed projects."
	strBio =  strBio & CRLF & CRLF & "Jim is single and shares his home with his cat Cleo. They live in a small comfortable home just outside Cobourg."
	thiskvs.PutEncrypted("Multiline Biography", strBio, "1357")
	thiskvs.PutEncrypted("Single line", "Leadership is the art of getting people to do what you want them to do, without them realizing you want them to do it. - Winston Churchill", "1357")
	Dim listTemp As List
	listTemp.Initialize
	listTemp.Add("Red")
	listTemp.Add("Orange")
	listTemp.Add("Yellow")
	listTemp.Add("Green")
	listTemp.Add("Blue")
	listTemp.Add("Indigo")
	listTemp.Add("Violet")
	listTemp.Add("Mnemonic: Run, Oh You Great Big Irish Varlet")
	thiskvs.PutEncrypted("A Big Prime Number", 108293, "1357")
	thiskvs.PutEncrypted("Colour List", listTemp, "1357")
	thiskvs.PutEncrypted("This file is encrypted", "True", "1357")
	thiskvs.Close
End Sub